class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int mx = Integer.MIN_VALUE;
        
        for(int i = 0; i<accounts.length; i++){
            int a = 0;
            for(int j = 0; j<accounts[0].length; j++){
                a+=accounts[i][j];
            }
            mx = Math.max(mx, a);
        }
        return mx;
    }
}