class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        boolean ans = false;
        int c = 0;
        
        for(int i = 1; i<=(s.length()+1)/2; i++){
            boolean imd = true;
            String cp = s.substring(0, i);
            for(int j = 0; j<=s.length()-i; j+=i){
                if(s.substring(j, i+j).equals(cp)){
                    c++;
                }
                else{
                    imd = false;
                }
            }
            if(imd && c>1 && c*i==s.length()){
                ans=true;
                break;
            }
            else{
                c=0;
            }
        }
        if(ans){
            return true;
        }
        else{
            return false;
        }
    }
}