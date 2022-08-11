class Solution {
    public int findCenter(int[][] edges) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<edges.length; i++){
            hm.put(edges[i][0], hm.getOrDefault(edges[i][0], 0)+1);
            hm.put(edges[i][1], hm.getOrDefault(edges[i][1], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue() == edges.length){
                return entry.getKey();
            }
        }
        return -1;
    }
}