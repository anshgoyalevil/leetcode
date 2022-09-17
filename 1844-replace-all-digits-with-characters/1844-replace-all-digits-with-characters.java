class Solution {
    public String replaceDigits(String s) {
        
        String ans = "";
        
        for(int i = 0; i<s.length(); i+=2){
            ans+=s.charAt(i);
            if(i+1<s.length()){
                ans+=(char)((int)s.charAt(i) + s.charAt(i+1)-'0');
            }
            
        }
        return ans;
    }
}