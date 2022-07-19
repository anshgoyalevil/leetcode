class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int ind = 0;
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            if(nums[i]%2==0){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                ind++;
            }
        }
        
        return nums;
        
    }
}