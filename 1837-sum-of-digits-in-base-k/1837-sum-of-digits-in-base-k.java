class Solution {
    public int sumBase(int n, int k) {
        
        String num = Integer.toString(n, k);
        
        int sm = 0;
        
        for(int i = 0; i<num.length(); i++){
            sm+=num.charAt(i)-'0';
        }
        return sm;
    }
}