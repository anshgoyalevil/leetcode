class Solution {
    public int[] countPoints(int[][] p, int[][] q) {
        
        int [] ans = new int [q.length];
        
        for(int i = 0; i<q.length; i++){
            int rsq = q[i][2]*q[i][2];
            for(int j = 0; j<p.length; j++){
                int dis = (q[i][0]-p[j][0])*(q[i][0]-p[j][0]) + (q[i][1]-p[j][1])*(q[i][1]-p[j][1]);
                if(dis<=rsq){
                    ans[i]++;
                }
            }
        }
        
        return ans;
        
    }
}