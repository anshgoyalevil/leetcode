class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        
        int r1 = 0;
        int r2 = 0;
        int c1 = 0;
        int c2 = 0;
        
        String [] n1 = num1.split("\\+");
        String [] n2 = num2.split("\\+");
        
         r1 = Integer.parseInt(n1[0]);
         r2 = Integer.parseInt(n2[0]);
        
         c1 = Integer.parseInt(n1[1].substring(0, n1[1].length()-1));
         c2 = Integer.parseInt(n2[1].substring(0, n2[1].length()-1));
        
        int a = r1*r2;
        int b = r1*c2;
        int c = r2*c1;
        int d = -(c1*c2);
        
        int a1 = a+d;
        int a2 = b+c;
        
        return (a1 + "+" + a2+"i");
        
    }
}