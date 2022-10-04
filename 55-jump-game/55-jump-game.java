class Solution {
    public boolean canJump(int[] nums) {
        
        boolean [] b = new boolean [nums.length];
        b[nums.length-1] = true;
        
        for(int i = nums.length-2; i>-1; i--){
            if(nums[i] != 0){
                for(int j = 1; j<Math.min(nums[i]+1, nums.length); j++){
                    if(b[j+i] == true){
                        b[i] = true;
                        break;
                    }
                }
            }
        }
        
        return b[0];
        
    }
}