class Solution {
    public int mostWordsFound(String[] s) {
        
        int mx = -1;
        
        for(int i = 0; i<s.length; i++){
            String[] c = s[i].split(" ");
            mx = Math.max(mx, c.length);
        }
        return mx;
    }
}