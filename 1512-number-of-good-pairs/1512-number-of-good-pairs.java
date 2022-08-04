class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        
        int ans = 0;
        
        for(Map.Entry<Integer, Integer> e: hm.entrySet()){
            ans+= ((e.getValue())*(e.getValue() -1))/2;
        }
        
        return ans;
        
    }
}