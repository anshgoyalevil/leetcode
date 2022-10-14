class Solution {
    public int maximumBags(int[] c, int[] r, int a) {
        
        for(int i = 0; i<c.length; i++){
            c[i] = c[i] - r[i];
        }
        
        r[r.length-1] = 0;
        
        Arrays.sort(c);
        
        for(int i = 0; i<c.length; i++){
            if(c[i]<=a){
                r[r.length-1]++;
                a-=c[i];
            }
        }
        return r[r.length-1];
    }
}