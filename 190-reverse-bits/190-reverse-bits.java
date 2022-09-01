public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        String s = Integer.toBinaryString(n);
        int sz = s.length();
        //System.out.println(s);
        String rev = "";
        for(int i = 0; i<32-sz; i++){
            s = '0'+s;
        }
        //System.out.println(s);
        for(int i = s.length()-1; i>-1; i--){
            rev+=s.charAt(i);
        }
        
        //System.out.println(rev);
        
        return (int)Long.parseLong(rev, 2);
        
    }
}