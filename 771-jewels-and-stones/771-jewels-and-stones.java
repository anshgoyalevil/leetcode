class Solution {
    public int numJewelsInStones(String j, String s) {
        
        int n = 0;
        
        HashSet<Character> h = new HashSet<>();
        
        for(int i=0; i<j.length(); i++){
            h.add(j.charAt(i));
        }
        
        for(int i = 0; i<s.length(); i++){
            if(h.contains(s.charAt(i))){
                n++;
            }
        }
        
        return n;
        
    }
}