class Solution {
    public String findDifferentBinaryString(String[] nums) {
        
        TreeSet<Integer> ts = new TreeSet<>();
        
        int n = nums.length;
        
        int t = (int)Math.pow(2, n) - 1;
        
        for(int i = 0; i<=t; i++){
            ts.add(i);
        }
        
        for(int i = 0; i<nums.length; i++){
            ts.remove(Integer.parseInt(nums[i], 2));
        }
        
        int ans = 0;
        
        ans = ts.ceiling(0);
        
        String s = Integer.toBinaryString(ans);
        
        if(s.length()<n){
            int l = s.length();
            for(int i = 0; i<n-l; i++){
                s='0'+s;
            }
        }
        return s;
    }
}