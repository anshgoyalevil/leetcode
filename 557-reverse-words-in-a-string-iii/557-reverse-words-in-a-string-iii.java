class Solution {
    public String reverseWords(String s) {
        
        String [] words = s.split("\\s+");
        
        String ans = "";
        
        for(int i = 0; i<words.length; i++){
        char[] temparray = words[i].toCharArray();
        int left, right = 0;
        right = temparray.length - 1;
  
        for (left = 0; left < right; left++, right--) {
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }
  
        for (char c : temparray){
            ans+=c;
        }
            ans+=" ";
        }
        return ans.substring(0, ans.length()-1);
    }
}