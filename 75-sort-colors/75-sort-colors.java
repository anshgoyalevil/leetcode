class Solution {
    public void sortColors(int[] nums) {
        
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int ind = 0;
        
        for(int i = 0; i<nums.length; i++){
            
            if(nums[i] == 2){
                twos++;
            }
            else if(nums[i] == 1){
                ones++;
            }
            else if(nums[i] == 0){
                zeros++;
            }
            
        }
        
        for(int i = 0; i<nums.length; i++){
            if(zeros>0){
                nums[ind] = 0;
                ind++;
                zeros--;
            }
            else if(ones>0){
                nums[ind] = 1;
                ind++;
                ones--;
            }
            else if(twos>0){
                nums[ind] = 2;
                ind++;
                twos--;
            }
        }
        
    }
}