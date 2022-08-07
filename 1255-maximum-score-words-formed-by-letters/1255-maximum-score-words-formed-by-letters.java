class Solution {
    
    public int mxf(String[] words, int [] farr, int [] score, int idx){
        
        if(idx == words.length){
            return 0;
        }
        
        int no = mxf(words, farr, score, idx+1);
        
        int scThis = 0;
        boolean flag = true;
        String word = words[idx];
        for(int i = 0; i<word.length(); i++){
            
            char ch = word.charAt(i);
            
            if(farr[ch-'a'] == 0){
                flag = false;
            }
            
            farr[ch-'a']--;
            scThis+=score[ch-'a'];
            
        }
        
        int syes = 0;
        if(flag){
            syes = scThis+mxf(words, farr, score, idx+1);
        }
        
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            farr[ch-'a']++;            
        }
        
        return Math.max(syes, no);
        
    }
    
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        
        int [] farr = new int [26];
        
        for(int i = 0; i<letters.length; i++){
            farr[letters[i]-'a']++;
        }
        return mxf(words, farr, score, 0);
    }
}