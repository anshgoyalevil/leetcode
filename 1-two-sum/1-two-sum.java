


class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] nums1 = new int[2];
        out:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    nums1[0] = i;
                    nums1[1] = j;
                    break out;
                }

            }
        }
        return nums1;
    }
}