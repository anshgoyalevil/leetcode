class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        
        String a = "";
        String b = "";
        
        for(int i = 0; i<w1.length; i++){
            a+=w1[i];
        }
        for(int i = 0; i<w2.length; i++){
            b+=w2[i];
        }
        
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
        
    }
}