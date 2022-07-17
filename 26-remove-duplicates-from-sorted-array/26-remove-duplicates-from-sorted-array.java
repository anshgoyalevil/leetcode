class Solution {
    public int removeDuplicates(int[] nums) {
        
        int a = -111;
        int ind = 0;
        for(int i = 0; i<nums.length;i++){
            
            if(a!=nums[i]){
                
                a = nums[i];
                nums[ind] = a;
                ind++;
                
            }
            
        }
        
        return ind;
        
    }
}