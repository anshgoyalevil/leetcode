class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int [] arr = new int[26];
        
        for(int i = 0; i<magazine.length(); i++){
            arr[(int)magazine.charAt(i) - 97]++;
        }
        
        for(int i = 0; i<ransomNote.length(); i++){
            if(arr[(int)ransomNote.charAt(i) - 97] != 0){
                arr[(int)ransomNote.charAt(i) - 97]--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}