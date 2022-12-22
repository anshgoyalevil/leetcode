class Solution {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public int subarrayLCM(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int m = nums[i];
            int g = nums[i];
            int l = nums[i];
            if (l == k) {
                ans++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                
                //System.out.println(l + " " + g + " " + m);
                g = gcd(l, nums[j]);
                m = l * nums[j];
                l = m / g;
                if (l == k) {
                    ans++;
                } else if (l > k) {
                    break;
                }
            }
        }
        return ans;
    }
}
