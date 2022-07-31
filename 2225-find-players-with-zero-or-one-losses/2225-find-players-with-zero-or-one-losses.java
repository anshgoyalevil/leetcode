class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<matches.length; i++){
            hm.put(matches[i][1], hm.getOrDefault(matches[i][1], 0)+1);
        }
        
        for(int i = 0; i<matches.length; i++){
            for(int j = 0; j<2; j++){
                if(!hm.containsKey(matches[i][j])){
                    l0.add(matches[i][j]);
                    hm.put(matches[i][j], 1000000);
                }
                else if(hm.get(matches[i][j]) == 1){
                    l1.add(matches[i][j]);
                    hm.put(matches[i][j], 10000000);
                }
            }
        }
        
        Collections.sort(l1);
        Collections.sort(l0);
        
        ll.add(l0);
        ll.add(l1);
        
        return ll;
        
    }
}