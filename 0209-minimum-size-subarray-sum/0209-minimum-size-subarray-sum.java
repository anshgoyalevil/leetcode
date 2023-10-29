class Solution {

    public int minSubArrayLen(int t, int[] a) {
        int ans = Integer.MAX_VALUE;

        long sum = 0;

        int i = 0;
        int j = 0;
        int n = a.length;

        for (; j < n; j++) {
            sum += a[j];
            if (sum >= t) {
                ans = Math.min(ans, j - i + 1);
            }
            while (sum >= t) {
                if (sum >= t) {
                    ans = Math.min(ans, j - i + 1);
                }
                sum -= a[i];
                i++;
            }
        }

        while (sum >= t && i < n) {
            if (sum == t) {
                ans = Math.min(ans, j - i + 1);
            }
            sum -= a[i];
            i++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
