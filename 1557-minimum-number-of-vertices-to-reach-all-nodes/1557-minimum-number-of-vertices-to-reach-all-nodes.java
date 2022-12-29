class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        
        List<Integer> ans = new ArrayList<>();
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<edges.size(); i++){
            hs.add(edges.get(i).get(1));
        }
        
        for(int i = 0; i<n; i++){
            if(!hs.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}