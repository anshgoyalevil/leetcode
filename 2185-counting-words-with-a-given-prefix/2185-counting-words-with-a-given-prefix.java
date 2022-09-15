class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int ans = 0;
        
        for(int i = 0; i<words.length; i++){
            if(words[i].length()<pref.length()){
                continue;
            }
            int a = 0;
            for(int j = 0; j<pref.length(); j++){
                if(words[i].charAt(j) == pref.charAt(j)){
                    a++;
                }
                else{
                    a--;
                }
            }
            if(a == pref.length()){
                ans++;
            }
        }
        return ans;
    }
}