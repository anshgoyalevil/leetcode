class Solution {
    public String reverseWords(String s) {
        
        String str = s.trim().replaceAll(" +", " ");
        
        String [] arr = str.split(" ", 0);
        
        str = "";
        
        for(int i = arr.length-1; i>-1; i--){
            str+=arr[i] + " ";
        }
        
        return str.substring(0, str.length()-1);
        
    }
}