class Solution {
    public int triangularSum(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        int f = 0;
        int [] ans = new int [nums.length];
        
        for(int i = 0; i<nums.length-1; i++){
            for(int j = f; j<nums.length-1; j++){
                ans[j+1] = (nums[j+1] + nums[j])%10;
            }
            nums = Arrays.copyOf(ans, nums.length);
            f++;
        }
        
        return ans[nums.length-1];
        
    }
}