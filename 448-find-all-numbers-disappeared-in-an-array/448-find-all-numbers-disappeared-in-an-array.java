class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n = nums.length;
        
        int it = 0;
        int temp1 = 0;
        int temp2 = 0;
        
        for(int i = 0; i<n;){
            
            if(nums[i] == i+1){
                i++;
            }
            else{
                it = nums[i] - 1;
                temp1 = nums[i];
                temp2 = nums[it];
                nums[it] = temp1;
                nums[i] = temp2;
                if(temp1 == temp2){
                    i++;
                }
            }
            
        }
        
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i<n; i++){
            if(nums[i] != i+1){
                arr.add(i+1);
            }
        }
        
        
        
        return arr;
        
    }
}