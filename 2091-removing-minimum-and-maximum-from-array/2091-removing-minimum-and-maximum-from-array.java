class Solution {
    public int minimumDeletions(int[] nums) {
        
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        int mni = -1;
        int mxi = -1;
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<mn){
                mn = nums[i];
                mni = i;
            }
            if(nums[i]>mx){
                mx = nums[i];
                mxi = i;
            }
        }
        
        int a = mni;
        int b = mxi;
        
        mni = Math.min(a,b);
        mxi = Math.max(a,b);
        
        int r1 = mni+1;
        int r2 = nums.length-mxi;
        int r3 = mxi+1;
        int r4 = nums.length-mni;
        
        return Math.min(r1+r2, Math.min(r3, r4));
        
    }
}