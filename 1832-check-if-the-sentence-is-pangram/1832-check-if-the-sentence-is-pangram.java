class Solution {
    public boolean checkIfPangram(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        
        for(int i = 0; i<s.length(); i++){
            hs.add(s.charAt(i));
        }
        if(hs.size() == 26){
            return true;
        }
        else{
            return false;
        }
    }
}