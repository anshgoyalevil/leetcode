class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int [] ans = new int [2*n];
        
        int a = 0;
        int b = 0+n;
        
        for(int i = 0; i<2*n; i+=2){
            ans[i] = nums[a];
            ans[i+1] = nums[b];
            a++;
            b++;
        }
        return ans;
    }
}