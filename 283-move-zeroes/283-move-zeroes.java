class Solution {
    public void moveZeroes(int[] nums) {
        
        int ind = 0;
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                nums[ind] = nums[i];
                ind++;
            }
        }
        
        for(int i = ind; i<n; i++){
            
         nums[i] = 0;   
            
        }
    }
}