class Solution {
    public int longestContinuousSubstring(String s) {
        
        int mx = -1;
        
        if(s.length() == 1){
            return 1;
        }
        else{
            int a = 1;
            for(int i = 0; i<s.length()-1; i++){
                if(s.charAt(i+1)-s.charAt(i) == 1){
                    a++;
                }
                else{
                    mx = Math.max(mx, a);
                    a = 1;
                }
            }
            mx=Math.max(mx, a);
            return mx;
        }
        
    }
}