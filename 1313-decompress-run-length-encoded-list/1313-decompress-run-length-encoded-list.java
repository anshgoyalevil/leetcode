class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int l = 0;
        
        for(int i = 0; i<nums.length; i+=2){
            l+=nums[i];
        }
        
        int [] arr = new int [l];
        
        int f = 0;
        
        for(int i = 1; i<nums.length; i+=2){
            for(int j = 0; j<nums[i-1]; j++){
                arr[f] = nums[i];
                f++;
            }
        }
        return arr;
    }
}