class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i = 0; i<words.length; i++){
            int a = 0;
            int b = words[i].length()-1;
            boolean f = true;
            while(a<b){
                if(words[i].charAt(a) != words[i].charAt(b)){
                    f = false;
                    break;
                }
                a++;
                b--;
            }
            
            if(f){
                return words[i];
            }
            
        }
        return "";
    }
}