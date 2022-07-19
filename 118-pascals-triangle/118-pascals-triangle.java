class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ll = new ArrayList<>();
        
        for(int i = 0; i<numRows; i++){
            ll.add(new ArrayList<>());
        }
        int r = 1;
        for(int i = 0; i<numRows; i++){
            
            for(int j = 0; j<r; j++){
                
                if(j == 0 || j == r - 1){
                    ll.get(i).add(1);
                }
                else{
                    ll.get(i).add(ll.get(i-1).get(j-1) + ll.get(i-1).get(j));
                }
                
            }
            r+=1;
            
        }
        
        return ll;
        
    }
}