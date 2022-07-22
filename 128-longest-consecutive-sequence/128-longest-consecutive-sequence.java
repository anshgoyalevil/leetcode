class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<n; i++){
            hs.add(nums[i]);
        }
        
        int ans = 0;
        
        for(int i = 0; i<n; i++){
            if(hs.contains(nums[i] - 1)){
                continue;
            }
            else{
                
                int num = nums[i];
                int mx = 1;
                
                while(hs.contains(num+1)){
                    mx++;
                    num++;
                }
                
                ans = Math.max(ans, mx);
                
            }
        }
        
        return ans;
        
    }
}