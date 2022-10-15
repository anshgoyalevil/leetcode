class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        List<Integer> l = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        
        for(int i = 0; i<nums.length; i++){
            if(hm.get(nums[i]) == 1){
                if(!hm.containsKey(nums[i]-1) && !hm.containsKey(nums[i]+1)){
                    l.add(nums[i]);
                }
            }
        }
        return l;
    }
}