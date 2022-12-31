class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int s = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                s += nums[i];
            }
        }

        int[] ans = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            if ((q[i][0] + nums[q[i][1]]) % 2 != 0 && nums[q[i][1]] % 2 == 0) {
                s = s - nums[q[i][1]];
                ans[i] = s;
                nums[q[i][1]] += q[i][0];
            } else if ((q[i][0] + nums[q[i][1]]) % 2 == 0 && nums[q[i][1]] % 2 == 0) {
                s = s + q[i][0];
                ans[i] = s;
                nums[q[i][1]] += q[i][0];
            } else if ((q[i][0] + nums[q[i][1]]) % 2 == 0 && nums[q[i][1]] % 2 != 0) {
                s += (q[i][0] + nums[q[i][1]]);
                ans[i] = s;
                nums[q[i][1]] += q[i][0];
            } else {
                nums[q[i][1]] += q[i][0];
                ans[i] = s;
            }
        }
        return ans;
    }
}
