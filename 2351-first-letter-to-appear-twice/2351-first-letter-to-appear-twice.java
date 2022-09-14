class Solution {
    public char repeatedCharacter(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        
        for(int i = 0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        return '0';
    }
}