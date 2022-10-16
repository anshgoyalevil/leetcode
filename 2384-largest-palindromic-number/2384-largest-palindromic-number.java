class Solution {
    public String largestPalindromic(String num) {
        
        StringBuilder str = new StringBuilder();
        
        int [] chars = new int [10];
        
        for(int i = 0; i<num.length(); i++){
            chars[num.charAt(i)-'0']++;
        }
        
        boolean even = false;
                
        for(int i = 9; i>0; i--){
            if(chars[i]!=0){
                if(chars[i]>=2){
                    even = true;
                }
                
                for(int j = 0; j<chars[i]/2; j++){
                    str.append((char)(i+'0'));
                }
            }
        }
        
        if(even){
            if(chars[0]!=0){
                for(int j = 0; j<chars[0]/2; j++){
                    str.append('0');
                }
            }
        }
        
        boolean odd = false;
        
        for(int i = 9; i>-1; i--){
            if(chars[i]%2!=0){
                str.append((char)(i+'0'));
                odd = true;
                break;
            }
        }
        
        // System.out.println(str);
        // System.out.println(even);
        // System.out.println(odd);
        
        String a = "";
        String b = "";
        
        if(odd){
            a = str.toString();
            b = str.reverse().substring(1, str.length());
        }
        else{
            a = str.toString();
            b = str.reverse().toString();
        }
        
        if((a+b).length() == 0){
            return "0";
        }
        
        return a+b;
        
    }
}