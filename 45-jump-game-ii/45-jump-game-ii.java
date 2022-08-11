class Solution {
    public int jump(int[] nums) {
        
        Integer [] dp = new Integer[nums.length];
        
        dp[nums.length-1] = 0;
        
        for(int i = nums.length-1; i>-1; i--){
            if(nums[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j = 1; j<=nums[i] && i+j<dp.length; j++){
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i+j]);
                    }
                }
                if(min!=Integer.MAX_VALUE){
                    dp[i] = min+1;
                }
            }
            
        }
        
        return dp[0];
        
    }
}