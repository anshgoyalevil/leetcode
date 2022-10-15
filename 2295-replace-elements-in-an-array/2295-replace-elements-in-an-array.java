class Solution {
    public int[] arrayChange(int[] nums, int[][] ops) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], i);
        }
        
        for(int i = 0; i<ops.length; i++){
            nums[hm.get(ops[i][0])] = ops[i][1];
            hm.put(ops[i][1], hm.get(ops[i][0]));
        }
        return nums;
    }
}