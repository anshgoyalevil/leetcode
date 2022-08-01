class Solution {
    
    int ans = 0;
    
    public int sol(int m, int n, int a, int b, int [][] dp){
        
        if(a<0 || b<0 || a>=m || b>=n){
            return 0;
        }
        
        if(a == m-1 && b == n-1){
            return 1;
        }
        
        if(dp[a][b] != 0){
            return dp[a][b];
        }
        
        return dp[a][b] = sol(m, n, a+1, b, dp) + sol(m, n, a, b+1, dp);
        
    }
    
    public int uniquePaths(int m, int n) {
        
        int [][] dp = new int [m+1][n+1];
        
        return sol(m, n, 0, 0, dp);
        
    }
}