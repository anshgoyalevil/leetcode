class Solution {
    public int reverse(int x) {
        
        int reverse = 0;
        String arb1 = "-2147483648";
        String arb2 = "2147483647";
        
        int dig = 0;
        
        while(x!=0){
            
            int rem = x%10;
            
            if(dig == 9 && ((reverse > 214748364) || (reverse < -214748364))){
           return 0;     
            }
            else if(dig == 9 && ((reverse > 214748364 && rem>7) || (reverse < -214748364 && rem<-8))){
                return 0;
            }
            else if(dig == 10){
                break;
            }
            
            reverse = reverse*10 + rem;
            dig++;
            System.out.println(dig + " " + reverse);
            x = x/10;
            
        }
        
        return reverse;
        
    }
}