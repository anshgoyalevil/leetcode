class Solution {
    public int thirdMax(int[] nums) {
        
        long mn1 = Long.MIN_VALUE;
        long mn2 = Long.MIN_VALUE;
        long mn3 = Long.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            
            mn1 = Math.max(mn1, nums[i]);
            
        }
        
        for(int i = 0; i<nums.length; i++){
            
            if(mn1 != nums[i]){
            mn2 = Math.max(mn2, nums[i]);
            }
            
        }
        
        for(int i = 0; i<nums.length; i++){
            
            if(nums[i] != mn2 && nums[i] != mn1){
            mn3 = Math.max(mn3, nums[i]);
            }
            
        }
        
        if(mn3 == Long.MIN_VALUE){
            return (int)mn1;
        }
        
        
        return (int)mn3;
        
    }
}