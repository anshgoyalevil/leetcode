class Solution {
    public int[] memLeak(int m1, int m2) {
        
        int t = 1;
        int r = 1;
        
        while(r<=m1 || r<=m2){
            if(m1>=m2){
                m1=m1-r;
                r++;
            }
            else if(m1<m2){
                m2=m2-r;
                r++;
            }
            t++;
        }
        int [] ans = {t, m1, m2};
        return ans;
    }
}