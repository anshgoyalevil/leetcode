class Solution {

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            hm.put(words[i], hm.getOrDefault(words[i], 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        List<Integer> ks = new ArrayList<>();

        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            ks.add(e.getValue());
        }

        Collections.sort(ks, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            String r = "zzzzzzzzzzzzzzzzz";
            for (Map.Entry<String, Integer> e : hm.entrySet()) {
                if(e.getValue() == ks.get(i)){
                    if(r.compareTo(e.getKey()) >= 0){
                        r = e.getKey();
                    }
                }
            }
            hm.remove(r);
            ans.add(r);
        }
        return ans;
    }
}
