class Solution {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        for (int i = 1; i <=amount; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i-coins[j]]!=Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        
        if(dp[amount] != Integer.MAX_VALUE){
            // for(int i = 0; i<dp.length; i++){
            //     System.out.println(dp[i]);
            // }
            return dp[amount];
        }
        else{
            // for(int i = 0; i<dp.length; i++){
            //     System.out.println(dp[i]);
            // }
            return -1;
        }
        
    }
}
