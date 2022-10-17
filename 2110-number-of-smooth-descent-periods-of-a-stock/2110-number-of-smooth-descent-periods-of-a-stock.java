class Solution {

    public long getDescentPeriods(int[] p) {
        
        long ans = 0;
        
        long temp = 1;
        
        for(int i = 1; i<p.length; i++){
            if(p[i-1]-p[i] == 1){
                temp++;
            }
            else{
                ans+=((temp)*(temp+1))/2;
                temp = 1;
            }
        }
        
        ans+=((temp)*(temp+1))/2;
        
        return ans;
        
    }
    
}
