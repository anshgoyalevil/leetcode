class Solution {
    public int minSteps(String s, String t) {
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        int [] ch = new int [26];
        
        for(int i=0; i<s.length(); i++){
            ch[s.charAt(i) - 97]++;
        }
        
        for(int i=0; i<t.length(); i++){
            if(ch[t.charAt(i) - 97] > 0){
                ch[t.charAt(i) - 97]--;
            }
        }
        
        int r = 0;
        
        for(int i = 0; i<26; i++){
            r = r + ch[i];
        }
        
        return r;
        
    }
}