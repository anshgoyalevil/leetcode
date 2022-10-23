class Solution {
    
    int mx = 0;
    
    public void sol(int [][] grid, int sum, int a, int b, int [][] vis){
        
        if(a<0 || b<0 || a>=grid.length || b>=grid[0].length || vis[a][b] == 1 || grid[a][b] == 0){
            mx = Math.max(sum, mx);
            //System.out.println(sum);
            return;
        }
        
        vis[a][b] = 1;
        sol(grid, sum+grid[a][b], a+1, b, vis);
        sol(grid, sum+grid[a][b], a, b+1, vis);
        sol(grid, sum+grid[a][b], a-1, b, vis);
        sol(grid, sum+grid[a][b], a, b-1, vis);
        vis[a][b] = 0;
        
    }
    
    public int getMaximumGold(int[][] grid) {
        
        int [][] vis = new int [grid.length][grid[0].length];
        
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[0].length; j++){
                if(grid[i][j]!=0){
                    sol(grid, 0, i, j, vis);
                }
            }
        }
        return mx;
    }
}