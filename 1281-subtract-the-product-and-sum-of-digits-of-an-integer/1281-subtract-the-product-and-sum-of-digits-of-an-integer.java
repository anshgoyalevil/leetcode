class Solution {
    public int subtractProductAndSum(int n) {
        
        String s = String.valueOf(n);
        
        int p = 1;
        int sm = 0;
        
        for(int i = 0; i<s.length(); i++){
            p = p*(s.charAt(i) - '0');
            sm = sm+(s.charAt(i) - '0');
        }
        
        return (int)p-sm;
        
    }
}