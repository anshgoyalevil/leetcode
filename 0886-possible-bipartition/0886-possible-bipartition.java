class Solution {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int color[] = new int[N+1];
         List<Integer> adj[] = new ArrayList[N+1];
         for(int i=1;i<=N;++i){
             adj[i] = new ArrayList<>();
         }
         Queue<Integer> queue = new LinkedList<>();
         for(int i=0;i<dislikes.length;++i){
             int u = dislikes[i][0];
             int v = dislikes[i][1];
             adj[u].add(v);
             adj[v].add(u);
         }
         boolean isBipart = true;
         for(int i=1;i<=N;++i){
             if(color[i]==0){
             isBipart=   dfs(color,adj,i,-1);
             if(!isBipart)return false;
             }
         }
         return isBipart;
    }
    private boolean dfs(int[] color, List<Integer>[] adj, int parent, int c) {
        color[parent] = c;
        for(int child:adj[parent]){
            if(color[child]==0){
             if(dfs(color, adj, child, -c)==false)return false;
            }else{
                if(color[parent]==color[child])return false;
            }
        }
      return true;
    }
}