class Solution {
    public int[] decode(int[] e, int f) {
        
        int [] ans = new int [e.length+1];
        
        ans[0] = f;
        
        for(int i = 1; i<ans.length; i++){
            ans[i] = (ans[i-1])^(e[i-1]);
        }
        
        return ans;
        
    }
}