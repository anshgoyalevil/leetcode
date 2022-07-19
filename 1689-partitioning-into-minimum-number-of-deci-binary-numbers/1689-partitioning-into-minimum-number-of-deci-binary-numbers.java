class Solution {
    public int minPartitions(String n) {
        
        int mx = -1;
        
        for(int i = 0; i<n.length(); i++){
            mx = Math.max(mx, Character.getNumericValue(n.charAt(i)));
        }
        
        return mx;
        
    }
}