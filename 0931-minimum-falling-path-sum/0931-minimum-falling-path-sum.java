class Solution {
    public int minFallingPathSum(int[][] m) {
        
        if(m.length == 1){
            return m[0][0];
        }
        
        int [][] dp = new int [m.length][m.length];
        
        for(int i = 0; i<m.length; i++){
            dp[m.length-1][i] = m[m.length-1][i];
        }
        
        for(int i = m.length-2; i>-1; i--){
            
            for(int j = 0; j<m.length; j++){
                
                if(j == 0){
                    dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + m[i][j];
                }
                
                else if(j == m.length-1){
                    dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j-1]) + m[i][j];
                }
                
                else{
                    dp[i][j] = Math.min(dp[i+1][j], Math.min(dp[i+1][j-1], dp[i+1][j+1])) + m[i][j];
                }
                
            }
            
        }
        
        int mn = Integer.MAX_VALUE;
        
        for(int i = 0; i<m.length; i++){
            mn = Math.min(mn, dp[0][i]);
        }
        return mn;
    }
}