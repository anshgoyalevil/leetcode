class Solution {
    public int maxFrequency(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long sum = 0;

        int n = nums.length;

        Arrays.sort(nums);

        for(; j<n; j++){
            sum+=nums[j];
            if(nums[j]*(j-i+1)-sum>k){
                sum-=nums[i];
                i++;
            }
        }

        return j-i;

    }
}