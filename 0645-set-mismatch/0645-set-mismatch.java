class Solution {
    public int[] findErrorNums(int[] nums) {
        int  n = nums.length;
        int[] arr = new int[n];
        int[] arr1 = new int[2];
       
        for(int i=0;i<n;i++){
            arr[nums[i]-1]++;
        }
        int k=0;
      for(int i=0;i<n;i++){
          if(arr[i] == 2){
              arr1[0] = i+1;
              
          }
          else if(arr[i] == 0){
              arr1[1] = i+1;
          }
      }
        return arr1;
    }
    
}