class Solution {
    public String interpret(String c) {
        
        String ans = "";
        
        for(int i = 0; i<c.length()-1;){
            if(c.charAt(i) == 'G'){
                ans+='G';
                i++;
            }
            else if(c.charAt(i) == '('){
                if(c.charAt(i+1) == ')'){
                    ans+='o';
                    i+=2;
                }
                else{
                    ans+="al";
                    i+=4;
                }
            }
        }
        
        if(c.charAt(c.length()-1) == 'G'){
            ans+='G';
        }
        
        return ans;
        
    }
}