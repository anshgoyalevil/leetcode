class Solution {
    
    public boolean pal(String str){
        
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
 
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
        
    }
    
    public String longestPalindrome(String s) {
        
        String ans = "";
        
        int mx = -1;
        
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                String temp = s.substring(i, j+1);
                int a = i-1;
                int b = j+1;
                int len = j-i+1;
                if(len>mx){
                if(pal(temp)){
                    while(Math.min(a,b)>0 && s.length() - Math.max(a,b)>0){
                        if(s.charAt(a) == s.charAt(b)){
                            temp = s.charAt(a) + temp + s.charAt(b);
                            len+=2;
                            //System.out.println(temp);
                            a--;
                            b++;
                            
                        }
                        else{
                            break;
                        }
                    }
                    if(len>mx){
                        ans = temp;
                        mx = len;
                    }
                }
                }
            }
        }
        
        return ans;
        
    }
}