class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int [] ans = new int [nums.length];
        
        int it = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < pivot){
                ans[it] = nums[i];
                it++;
            }
        }
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == pivot){
                ans[it] = nums[i];
                it++;
            }
        }
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > pivot){
                ans[it] = nums[i];
                it++;
            }
        }
        return ans;
    }
}