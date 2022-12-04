class Solution {
    public int minimizedMaximum(int n, int[] qt) {
        
        int mx = -1;
        
        for(int i = 0; i<qt.length; i++){
            mx = Math.max(mx, qt[i]);
        }
        
        int low = 1;
        
        int ans = 0;
        
        while(low<=mx){
            int mid = (low+mx)/2;
            long shops = 0;
            for(int i = 0; i<qt.length; i++){
                shops+=(int)Math.ceil((double)qt[i]/(double)mid);
            }
            if(shops<=n){
                ans=mid;
                mx = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}