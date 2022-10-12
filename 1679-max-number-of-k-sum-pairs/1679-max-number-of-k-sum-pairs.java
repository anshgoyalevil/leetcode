class Solution {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) != null) {
                int a = nums[i];
                if (k - a == a) {
                    if (hm.get(a) >= 2) {
                        ans++;
                        if (hm.get(a) == 2) {
                            hm.remove(a);
                        } else {
                            hm.put(a, hm.get(a) - 2);
                        }
                    }
                }
                else if (hm.get(k - a) != null) {
                    ans++;
                    if (hm.get(k - a) == 1) {
                        hm.remove(k - a);
                    } else {
                        hm.put(k - a, hm.get(k - a) - 1);
                    }
                    if (hm.get(a) != null) {
                        if (hm.get(a) == 1) {
                            hm.remove(a);
                        } else {
                            hm.put(a, hm.get(a) - 1);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
