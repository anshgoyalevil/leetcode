class Solution {
    
    public void shift(int [] nums, int ind){
        
        //Empty
        
    }
    
    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        for(int i=0; i<len;){
            
            if(nums[i] ==val){
                
                nums[i] = nums[len-1];
                nums[len-1] = 0;
                len--;
                
                
            }
            else{
                i++;
            }
            
          
            
        }
        
        return len;

        
    }
}