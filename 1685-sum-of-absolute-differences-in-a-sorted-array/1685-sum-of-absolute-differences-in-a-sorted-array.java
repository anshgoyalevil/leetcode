class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int [] ans = new int [nums.length];
        
        int [] pref = new int [nums.length];
        
        int [] suff = new int [nums.length];
        
        pref[0] = nums[0];
        suff[suff.length-1] = nums[nums.length-1];
        
        for(int i = 1; i<nums.length; i++){
            pref[i] = pref[i-1] + nums[i];
        }
        
        for(int i = nums.length-2; i>-1; i--){
            suff[i] = suff[i+1]+nums[i];
        }
        
        ans[0] = suff[1] - nums[0]*(nums.length-1);
        
        ans[ans.length-1] = nums[nums.length-1]*(nums.length-1) - pref[nums.length-2];
        
        int n = nums.length;

        for(int i = 1; i<nums.length-1; i++){
            ans[i] = (nums[i]*i - (pref[i-1])) + ((suff[i+1]) - nums[i]*(n-i-1)); 
        }
        return ans;
    }
}