class Solution {
    
    String [] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public int uniqueMorseRepresentations(String[] words) {
        
        HashSet<String> hs = new HashSet<>();
        
        for(int i = 0; i<words.length; i++){
            String c = "";
            for(int j = 0; j<words[i].length(); j++){
                c+=m[words[i].charAt(j)-97];
            }
            hs.add(c);
        }
        return hs.size();
    }
}