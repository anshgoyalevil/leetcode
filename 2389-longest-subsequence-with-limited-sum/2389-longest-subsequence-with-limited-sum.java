class Solution {
    public int[] answerQueries(int[] n, int[] q) {
        
        Arrays.sort(n);
        
        int r = 0;
        
        int [] ans = new int [q.length];
        
        for(int i = 0; i<q.length; i++){
            r = 0;
            for(int j = 0; j<n.length; j++){
                r+=n[j];
                if(r>q[i]){
                    ans[i] = j;
                    break;
                }
            }
            if(r<=q[i] && ans[i]==0){
                ans[i] = n.length;
            }
        }
        return ans;
    }
}