class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int [] hz = new int [grid.length];
        int [] vt = new int [grid.length];
        
        int n = grid.length;
        
        for(int i = 0; i<n; i++){
            int mx = Integer.MIN_VALUE;
            for(int j = 0; j<n; j++){
                mx = Math.max(mx, grid[i][j]);
            }
            vt[i] = mx;
        }
        
        for(int j = 0; j<n; j++){
            int mx = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                mx = Math.max(mx, grid[i][j]);
            }
            hz[j] = mx;
        }
        
        int sum = 0;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                sum = sum + Math.min(vt[i], hz[j]) - grid[i][j];
            }
        }
        
        return sum;
        
    }
}