class Solution {
    public double my(double x, int n) {
        
        if(n == 0){
            return 1;
        }
        
        double a = my(x, n/2);
        double b = a*a;
        
        if(n%2==1){
            b = b*x;
        }
        
        return b;
        
    }
    
    public double myPow(double x, int n) {
        
        if(n==0){
            return (double)1;
        }
        else if(n<0){
            x = 1d/x;
            int n1 = (n/2);
            int n2 = (n - n1);
            n1 = -n1;
            n2 = -n2;
            return my(x, n1)*my(x, n2);
        }
        
        return my(x, n);
        
    }
    
}