class Solution {
    
    public int sol(int n, int [] dp){
        if(n < 0){
            return 0;
        }
        
        if(dp[n] != 0){
            return dp[n];
        }
        else if(n==0){
            return 1;
        }
        
        int w1 = sol(n-1, dp);
        int w2 = sol(n-2, dp);
        
        return dp[n] = w1 + w2;
        
    }
    
    public int climbStairs(int n) {
        
        int [] dp = new int [n+1];
        
        return sol(n, dp);
        
    }
}