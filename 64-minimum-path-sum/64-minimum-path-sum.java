class Solution {
    public int minPathSum(int[][] grid) {
        
        int [][] dp = new int [grid.length][grid[0].length];
        
        for(int i = grid.length-1; i>-1; i--){
            for(int j = grid[0].length-1; j>-1; j--){
                if(i == grid.length-1 && j == grid[0].length-1){
                    dp[i][j] = grid[i][j];
                }
                else if(i == grid.length-1){
                    dp[i][j]=dp[i][j+1] + grid[i][j];
                }
                else if(j == grid[0].length - 1){
                    dp[i][j]=dp[i+1][j] + grid[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]) + grid[i][j];
                }
            }
        }
        
        return dp[0][0];
        
    }
}