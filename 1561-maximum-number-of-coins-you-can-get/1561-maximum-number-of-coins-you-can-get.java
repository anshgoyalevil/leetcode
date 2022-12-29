class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        
        int ans = 0;
        
        int m = piles.length/3;
        
        for(int i = piles.length-2; i>-1 && m>0; i-=2){
            ans+=piles[i];
            m--;
        }
        return ans;
    }
}