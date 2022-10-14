class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        
        for(int i = 0; i<c.length; i++){
            c[i] = c[i] - r[i];
        }
        
        int ans = 0;
        
        Arrays.sort(c);
        
        for(int i = 0; i<c.length; i++){
            if(c[i]<=a){
                ans++;
                a-=c[i];
            }
        }
        return ans;
    }
}