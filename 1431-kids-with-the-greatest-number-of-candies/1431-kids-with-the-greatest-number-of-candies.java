class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        
        int g = Integer.MIN_VALUE;
        
        for(int i = 0; i<candies.length; i++){
            g = Math.max(g, candies[i]);
        }
        
        List<Boolean> l = new ArrayList<>();
        
        for(int i = 0; i<candies.length; i++){
            if(candies[i]+e>=g){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        
        return l;
        
    }
}