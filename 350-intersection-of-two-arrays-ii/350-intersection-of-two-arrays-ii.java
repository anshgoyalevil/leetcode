class Solution {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        
        for(int i = 0; i<nums1.length; i++){
            hm1.put(nums1[i], hm1.getOrDefault(nums1[i], 0)+1);
        }
        for(int i = 0; i<nums2.length; i++){
            hm2.put(nums2[i], hm2.getOrDefault(nums2[i], 0)+1);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (Map.Entry<Integer,Integer> entry : hm1.entrySet()){
            if(hm2.containsKey(entry.getKey())){
                for(int i = 0; i<Math.min(entry.getValue(), hm2.get(entry.getKey())); i++){
                    arr.add(entry.getKey());
                }
            }
      
    }
        
        int [] ans = new int[arr.size()];
        
        for(int i = 0; i<arr.size(); i++){
            ans[i] = arr.get(i);
        }
        
        return ans;
               }
               
               
               
}