class Solution {
    public int maximumGroups(int[] g) {
        
        int ans = 1;
        
        Arrays.sort(g);
        
        int ps = 0;
        int pg = 0;
        int sf = 0;
        int gf = 0;
        
        for(int i = 0; i<g.length; i++){
            if(sf<=ps || gf<=pg){
                sf+=g[i];
                gf++;
            }
            else{
                //System.out.println(ps + " " + pg + " " + sf + " " + gf);
                ans++;
                ps = sf;
                pg = gf;
                sf = g[i];
                gf = 1;
            }
        }
        
        if(sf<=ps || gf<=pg){
            ans--;
        }
        
        return ans;
    }
}