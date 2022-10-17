class Solution {
    public long[] sumOfThree(long num) {
        
        long [] ans = new long [3];
        long [] e = new long [0];
        
        if(num%3!=0){
            return e;
        }
        
        long r = num/3;
        
        ans[0] = r-1;
        ans[1] = r;
        ans[2] = r+1;
        
        return ans;
        
    }
}