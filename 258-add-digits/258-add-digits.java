class Solution {
    public int addDigits(int num) {
        
        String str = String.valueOf(num);
        
        while(str.length() != 1){
            int n = 0;
            for(int i = 0; i<str.length(); i++){
                n+=str.charAt(i)-'0';
            }
            str = String.valueOf(n);
        }
        
        return Integer.parseInt(str);
        
    }
}