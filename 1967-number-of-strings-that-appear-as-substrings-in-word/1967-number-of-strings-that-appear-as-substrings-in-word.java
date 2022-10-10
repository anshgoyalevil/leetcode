class Solution {
    public int numOfStrings(String[] p, String w) {
        
        int c = 0;
        
        for(int i = 0; i<p.length; i++){
            if(w.indexOf(p[i]) != -1){
                c++;
            }
        }
        return c;
    }
}