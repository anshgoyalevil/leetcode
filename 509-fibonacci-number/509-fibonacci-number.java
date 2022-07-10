class Solution {
    
    public int f(int n, int [] dp){
        
        if(dp[n]!=0){
            return dp[n];
        }
        
        if(n == 0 || n == 1){
            return n;
        }
        
        return dp[n] = fib(n-1) + fib(n-2);
        
    }
    
    public int fib(int n) {
        
        int [] dp = new int[n+1];
        
        return f(n, dp);
        
    }
}