class Solution {
    public int maxSum(int[][] grid) {
        
        int mx = -1;
        
        int sum = 0;
        
        sum+=grid[0][0]+grid[0][1]+grid[0][2]+grid[1][1]+grid[2][0]+grid[2][1]+grid[2][2];
        mx = Math.max(mx, sum);
        
        for(int i = 0; i<grid.length-2; i++){
            sum = 0;
            for(int j = 0; j<grid[0].length-2; j++){
                sum+=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                mx = Math.max(mx, sum);
                sum = 0;
            }
        }
        return mx;
    }
}