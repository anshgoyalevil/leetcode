class Solution {
    
    public String bc(String number, int sBase, int dBase)
    {
        return Integer.toString(
            Integer.parseInt(number, sBase), dBase);
    }
    
    public boolean isp(String str)
    {
 
        int i = 0, j = str.length() - 1;
 
        while (i < j) {
 
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            i++;
            j--;
        }
 
        return true;
    }
    
    public boolean isStrictlyPalindromic(int n) {
        
        for(int i = 2; i<=n-2; i++){
            String num = bc(n+"", 10, i);
            if(!isp(num)){
                return false;
            }
        }
        return true;
    }
}