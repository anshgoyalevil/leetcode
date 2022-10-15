class Solution {

    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int ans = 1;

        int mn = nums[0];
        int mx = nums[0];

        for (int i = 1; i < nums.length; i++) {
            mx = Math.max(mx, nums[i]);
            mn = Math.min(mn, nums[i]);
            if (mx - mn > k) {
                ans++;
                mx = nums[i];
                mn = nums[i];
            }
        }
        if (mx - mn > k) {
            ans++;
        }
        return ans;
    }
}
