class Solution {
    public String sortSentence(String s) {
        
        String ans = "";
        
        String [] strs = s.split("\\s+");
        
        char n = '1';
        
        for(int i = 0; i<strs.length; i++){
            for(int j = 0; j<strs.length; j++){
                if(strs[j].charAt(strs[j].length()-1) == n){
                    ans = ans + strs[j].substring(0, strs[j].length()-1) + " ";
                    strs[j] = "0";
                    n++;
                }
            }
        }
        return ans.substring(0, ans.length()-1);
    }
}