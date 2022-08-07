class Solution {

    public List<List<Integer>> groupThePeople(int[] g) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> imd = new ArrayList<>();
        
        ans.add(new ArrayList<>());

        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int r = 0;

        for (int i = 0; i < g.length; i++) {
            hm.put(g[i], hm.getOrDefault(g[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int a = entry.getKey();
            int b = entry.getValue() / a;

            for (int i = 0; i < b; i++) {
                for (int j = 0; j < g.length; j++) {
                    
                    if (g[j] == a) {
                        ans.get(r).add(j);
                        g[j] = -1;
                        //System.out.println(imd);
                    }
                    if (ans.get(r).size() == a) {
                        ans.add(new ArrayList<>());
                        r++;
                        //System.out.println(ans);
                        break;
                    }
                    
                }
            }
        }
        
        if(ans.get(ans.size()-1).size() == 0){
            ans.remove(ans.size()-1);
        }

        return ans;
    }
}
