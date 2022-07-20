class Solution {
    public int findDuplicate(int[] nums) {
        
        int i = 0;
        
        for(i = 0; i<nums.length;){
            
            int go = nums[i] - 1;
            
            if(go == i || nums[go] == nums[i]){
                i++;
            }
            else{
                int temp = nums[go];
                nums[go] = nums[i];
                nums[i] = temp;
            }
            
        }
        
        for(int r = 0; r<nums.length; r++){
            if(r+1 != nums[r]){
                return nums[r];
            }
        }
        
        return -1;
        
    }
}