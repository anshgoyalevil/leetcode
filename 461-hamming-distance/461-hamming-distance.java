class Solution {
    public int hammingDistance(int x, int y) {
        
        int b = x^y;
        
        int ans = 0;
        
        String bin = Integer.toBinaryString(b);
        
        for(int i = 0; i<bin.length(); i++){
            if(bin.charAt(i) == '1'){
                ans++;
            }
        }
        
        return ans;
        
    }
}