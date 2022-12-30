class Solution {
    
    public static String ss(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
 
        Arrays.sort(tempArray);
 
        return new String(tempArray);
    }
    
    public boolean checkIfCanBreak(String s1, String s2) {
        
        s1 = ss(s1);
        s2 = ss(s2);
        
        boolean ans = false;
        
        int r = 0;
        
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)>=s2.charAt(i)){
                r++;
            }
        }
        
        if(r==s1.length()){
            ans = true;
        }
    
        r = 0;
        
        for(int i = 0; i<s1.length(); i++){
            if(s2.charAt(i)>=s1.charAt(i)){
                r++;
            }
        }
        
        if(r==s1.length()){
            ans = true;
        }
        return ans;
    }
}