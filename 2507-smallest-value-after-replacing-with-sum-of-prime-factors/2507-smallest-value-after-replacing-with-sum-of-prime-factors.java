class Solution {
    
    int sum = 0;

    public void pf(int n) {
        while (n % 2 == 0) {
            sum+=2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                sum+=i;
                n /= i;
            }
        }

        if (n > 2) sum+=n;
    }

    public int smallestValue(int n) {
        
        int ps = n;
        
        while(true){
            sum = 0;
            pf(ps);
            if(ps == sum){
                return sum;
            }
            ps = sum;
        }
        //return ps;
    }
}
