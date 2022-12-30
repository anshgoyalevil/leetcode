class Solution {
    
    public Integer[] method(String str)
    {
 
        String[] splitArray = str.split(" ");
        Integer[] array = new Integer[splitArray.length];
 
        // parsing the String argument as a signed decimal
        // integer object and storing that integer into the
        // array
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public void dfs(int [][] graph, int src, boolean [] vis, String psf){
        
        if(src == graph.length-1){
            psf=psf+ " " + src;
            //System.out.println(psf);
            Integer [] arr = method(psf);
            List al = Arrays.asList(arr);
            ans.add(al);
            return;
        }
        
        vis[src] = true;
        for(int e: graph[src]){
            if(vis[e]==false){
                if(psf.equals("")){
                    dfs(graph, e, vis, psf + src);
                }
                else{
                dfs(graph, e, vis, psf + " " +src);
                }
            }
        }
        vis[src] = false;
        
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        boolean [] vis = new boolean[graph.length];
        
        dfs(graph, 0, vis, "");
        
        return ans;
        
    }
}