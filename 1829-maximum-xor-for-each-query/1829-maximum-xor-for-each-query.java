class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int r = (int) Math.pow(2, maximumBit) - 1;
        
        int it = 0;
        
        int prev = 0;
        
        int [] ans = new int [nums.length];
        
        for(int i = nums.length-1; i>-1; i--){
            ans[i] = prev^nums[it]^r;
            prev = prev^nums[it];
            it++;
        }
        return ans;
    }
}