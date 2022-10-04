class Solution {
    public int maxProfit(int[] prices) {
        
        int p = 0;
        
        int cs = prices[0];
        
        for(int i = 1; i<prices.length; i++){
            if(prices[i] > cs){
                p+=prices[i]-cs;
                cs = prices[i];
            }
            else if(prices[i] < cs){
                cs = prices[i];
            }
        }
        return p;
    }
}