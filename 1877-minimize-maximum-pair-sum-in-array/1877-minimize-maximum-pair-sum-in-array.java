class Solution {
    public int minPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int mx = Integer.MIN_VALUE;
        
        int i = 0;
        int j = nums.length-1;
        
        while(i<j){
            mx = Math.max(mx, nums[i]+nums[j]);
            i++;
            j--;
        }
        
        return mx;
        
    }
}