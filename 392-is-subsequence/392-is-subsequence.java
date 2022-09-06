class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(t.length() < s.length()){
            return false;
        }
        
        int a = 0;
        
        for(int i = 0; i<t.length(); i++){
            if(a < s.length() && s.charAt(a) == t.charAt(i)){
                a++;
            }
        }
        if(a == s.length()){
            return true;
        }
        return false;
    }
}