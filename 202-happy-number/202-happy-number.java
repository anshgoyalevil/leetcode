class Solution {
    public boolean isHappy(int n) {
        if(n == 1 || n==7)
            return true;
        
        if(n> 0 && n<10)
            return false;
        
        return isHappy(getSum(n));
    }
    public int getSum(int n)
    {
        int sum = 0;
        int temp = 0;
        while(n>0)
        {
            temp = n%10;
            sum = sum + temp*temp;
            n = n/10;
        }
        return sum;
    }
}