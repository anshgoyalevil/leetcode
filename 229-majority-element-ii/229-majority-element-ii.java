class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            
            if(entry.getValue() > Math.floor(nums.length)/3){
                ans.add(entry.getKey());
            }
            
        }
        
        return ans;
        
    }
}