class Solution {
    public int[][] restoreMatrix(int[] rs, int[] cs) {
        
        int [][] ans = new int [rs.length][cs.length];
        
        for(int i = 0; i<cs.length; i++){
            for(int j = 0; j<rs.length; j++){
                int a = Math.min(rs[j], cs[i]);
                rs[j]-=a;
                cs[i]-=a;
                ans[j][i] = a;
            }
        }
        return ans;
    }
}