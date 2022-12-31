public class Solution {

    public List<String> subdomainVisits(final String[] cpdomains) {
        final Map<String, Integer> hm = new HashMap<>(cpdomains.length * 4);
        for (String cpdomain : cpdomains) {
            final String[] cpFields = cpdomain.split(" ");
            final int rep = Integer.parseInt(cpFields[0]);
            final String d = cpFields[1];
            final int dot1 = d.indexOf('.');
            final int dot2 = d.lastIndexOf('.');

            hm.put(d, hm.getOrDefault(d, 0) + rep);
            final String tld = d.substring(dot2 + 1);
            hm.put(tld, hm.getOrDefault(tld, 0) + rep);
            if (dot1 != dot2) {
                final String sld = d.substring(dot1 + 1);
                hm.put(sld, hm.getOrDefault(sld, 0) + rep);
            }
        }
        final List<String> ret = new ArrayList<>(hm.size());
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(e.getValue()).append(" ").append(e.getKey());
            ret.add(sb.toString());
        }
        return ret;
    }
}
