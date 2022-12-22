class Solution {
    
    int ans = 0;
    
    public void f(int t, int e, int [] nums, int id){
        if(id == nums.length){
            if(e == t){
                ans++;
            }
            return;
        }
        f(t, e+nums[id], nums, id+1);
        f(t, e-nums[id], nums, id+1);
    }
    
    public int findTargetSumWays(int[] nums, int target) {
        f(target, 0, nums, 0);
        return ans;
    }
}