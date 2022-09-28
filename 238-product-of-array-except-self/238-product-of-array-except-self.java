class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] a1 = new int [nums.length];
        int [] a2 = new int [nums.length];
        
        a1[0] = nums[0];
        a2[nums.length-1] = nums[nums.length-1];
        
        for(int i = 1; i<nums.length; i++){
            a1[i] = nums[i]*a1[i-1];
        }
        for(int i = nums.length-2; i>-1; i--){
            a2[i] = nums[i]*a2[i+1];
        }
        
        nums[0] = a2[1];
        nums[nums.length-1] = a1[a1.length-2];
        
        for(int i = 1; i<nums.length-1; i++){
            nums[i] = a1[i-1]*a2[i+1];
        }
        return nums;
    }
}