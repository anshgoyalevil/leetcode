class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<nums1.length; i++){
            hs.add(nums1[i]);
        }
        
        for(int i = 0; i<nums2.length; i++){
            if(hs.contains(nums2[i])){
                ans.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
        
    }
}