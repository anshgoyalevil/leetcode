class Solution {
    
    public int gcd(int a, int b){
        
        if(b == 0){
            return a;
        }
        
        return gcd(b, a%b);
        
    }
    
    public int findGCD(int[] nums) {
        
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        
        for(int i = 0; i<nums.length; i++){
            mn = Math.min(mn, nums[i]);
            mx = Math.max(mx, nums[i]);
        }
        return gcd(mn, mx);
    }
}