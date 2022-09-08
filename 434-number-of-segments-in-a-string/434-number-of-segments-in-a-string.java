class Solution {
    public int countSegments(String s) {
        
        s = s.trim();
        
        String [] str = s.split("\\s+");
        
        if(s.length() == 0){
            return 0;
        }
        
        return str.length;
        
    }
}