class Solution {
    public int majorityElement(int[] nums) {
        
        long candidate = 10000000000l;
        
        int votes = 0;
        
        for(int i = 0; i<nums.length; i++){
            
            if(votes == 0){
                candidate = nums[i];
                votes = 1;
            }
            else if(candidate != nums[i]){
                votes--;
            }
            else{
                votes++;
            }
            
        }
        
        return (int)candidate;
        
    }
}