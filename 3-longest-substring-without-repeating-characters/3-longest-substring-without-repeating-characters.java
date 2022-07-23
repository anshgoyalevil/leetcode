class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        
        int mx = 0;
        int j = 0;
        for(int i = 0; i<s.length(); i++){
            
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
            else{
                mx = Math.max(mx, hs.size());
                hs.clear();
                i=j;
                j++;
            }
            
        }
        
        mx = Math.max(mx, hs.size());
        return mx;
    }
}