class Solution {
    
    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
    
    public boolean isAnagram(String s, String t) {
        
        int n1 = s.length();
        int n2 = t.length();
        t = sortString(t);
        s = sortString(s);
        
        if(n1!=n2){
            return false;
        }
        
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }
        
    }
}