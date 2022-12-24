class Solution {

    public int numTilings(int n) {
        int[] dp = new int[n + 1];
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (((2 * dp[i - 1])%1000000007) + (dp[i - 3]%1000000007))%1000000007;
        }
        return dp[n];
    }
}
