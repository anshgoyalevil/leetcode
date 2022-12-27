class Solution {

    public int shipWithinDays(int[] w, int k) {
        int mx = 0;

        int mn = 0;

        for (int e : w) {
            mn = Math.max(mn, e);
            mx += e;
        }

        int ans = 0;

        while (mn <= mx) {
            int mid = (mn + mx) / 2;
            int d = 1;
            int r = 0;
            int x = 0;
            for (int i = 0; i < w.length;) {
                if (r + w[i] <= mid) {
                    r += w[i];
                    i++;
                } else {
                    d++;
                    r = 0;
                    if (r + w[i] > mid) {
                        break;
                    }
                    r += w[i];
                    i++;
                }
                x++;
            }
            if (d <= k && x == w.length) {
                ans = mid;
                mx = mid - 1;
            } else {
                mn = mid + 1;
            }
        }
        return ans;
    }
}
