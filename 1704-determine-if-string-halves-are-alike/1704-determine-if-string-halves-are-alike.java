class Solution {
    public boolean halvesAreAlike(String s) {
        
        s=s.toLowerCase();
        
        int a = 0;
        int b = 0;
        
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'){
                a++;
            }
        }
        
        for(int i = s.length()/2; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'){
                b++;
            }
        }
        return a==b;
    }
}