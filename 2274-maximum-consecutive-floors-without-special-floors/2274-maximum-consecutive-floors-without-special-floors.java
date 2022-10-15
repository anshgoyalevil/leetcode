class Solution {
    public int maxConsecutive(int b, int t, int[] s) {
        
        Arrays.sort(s);
                
        int mx = Integer.MIN_VALUE;
        
        mx = Math.max(s[0]-b, t-s[s.length-1]);
        
        for(int i = 0; i<s.length-1; i++){
            mx = Math.max(mx, s[i+1]-s[i]-1);
        }
        return mx;
    }
}