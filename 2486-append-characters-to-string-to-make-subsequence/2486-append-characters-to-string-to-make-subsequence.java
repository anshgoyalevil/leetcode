class Solution {
    public int appendCharacters(String s, String t) {
        
        int a = 0;
        int b = 0;
        
        int r = 0;
        
        while(true){
            if(a==s.length() || b == t.length()){
                break;
            }
            if(s.charAt(a) == t.charAt(b)){
                a++;
                b++;
            }
            else{
                a++;
            }
        }
        
        return t.length()-b;
        
    }
}