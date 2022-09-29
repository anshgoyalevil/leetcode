class Solution {

    public String customSortString(String order, String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < order.length(); i++) {
            if (hm.containsKey(order.charAt(i))) {
                for (int j = 0; j < hm.get(order.charAt(i)); j++) {
                    ans += order.charAt(i);
                }
                hm.remove(order.charAt(i));
            }
        }

        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            for (int j = 0; j < e.getValue(); j++) {
                ans += e.getKey();
            }
        }
        return ans;
    }
}
