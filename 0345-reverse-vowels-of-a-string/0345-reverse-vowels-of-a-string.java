class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder str = new StringBuilder(s);
        
        ArrayList<Character> v = new ArrayList<>();
        
        for(int i = s.length()-1; i>-1; i--){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
                v.add(s.charAt(i));
            }
        }
        
        int it = 0;
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' ||s.charAt(i) == 'A' ||s.charAt(i) == 'E' ||s.charAt(i) == 'I' ||s.charAt(i) == 'O' ||s.charAt(i) == 'U'){
                    ans.append(v.get(it));
                    it++;
                }
                else{
                    ans.append(s.charAt(i));
                }
        }
            
            return ans.toString();
        
    }
}