class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            StringBuilder s = new StringBuilder(nums[i]+"");
            hs.add(nums[i]);
            hs.add(Integer.parseInt((s.reverse()).toString()));
        }
        return hs.size();
    }
}