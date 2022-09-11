class Solution {
    public int countConsistentStrings(String all, String[] w) {
        
        HashSet<Character> hs = new HashSet<>();
        int ans = 0;
        
        for(int i = 0; i<all.length(); i++){
            hs.add(all.charAt(i));
        }
        
        for(int i = 0; i<w.length; i++){
            int r = 0;
            for(int j = 0; j<w[i].length(); j++){
                if(!hs.contains(w[i].charAt(j))){
                    r--; 
                }
                else{
                    r++;
                }
            }
            if(r == w[i].length()){
                ans++;
            }
        }
        return ans;
    }
}