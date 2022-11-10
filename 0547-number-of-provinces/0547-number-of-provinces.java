class Solution {
    
    int ans = 0;
    
    public void addEdge(int a, int b, ArrayList<ArrayList<Integer>> g){
        g.get(a).add(b);
    }
    
    public void dfs(ArrayList<ArrayList<Integer>> g, ArrayList<Boolean> vis, int s){
        vis.set(s, true);
        for(int e: g.get(s)){
            if(!vis.get(e)){
                dfs(g, vis, e);
            }
        }
    }
    
    public int findCircleNum(int[][] ic) {
        
        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        
        for(int i = 0; i<ic.length; i++){
            g.add(new ArrayList<>());
        }
        
        for(int i = 0; i<ic.length; i++){
            for(int j = 0; j<ic.length; j++){
                if(ic[i][j] == 1){
                    addEdge(i, j, g);
                }
            }
        }
        
        ArrayList<Boolean> vis = new ArrayList<>();
        
        for(int i = 0; i<ic.length; i++){
            vis.add(false);
        }
        
        for(int i = 0; i<ic.length; i++){
            if(!vis.get(i)){
                ans++;
                dfs(g, vis, i);
            }
        }
        return ans;
    }
}