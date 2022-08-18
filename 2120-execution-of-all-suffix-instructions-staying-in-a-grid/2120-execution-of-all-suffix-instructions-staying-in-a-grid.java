class Solution {

    public int[] executeInstructions(int n, int[] sp, String s) {
        int stx = sp[0];
        int sty = sp[1];
        int temp = 0;
        int[] ans = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'L') {
                    sty--;
                } else if (s.charAt(j) == 'R') {
                    sty++;
                } else if (s.charAt(j) == 'U') {
                    stx--;
                } else if (s.charAt(j) == 'D') {
                    stx++;
                }
                if (stx == n || sty == n || stx < 0 || sty < 0) {
                    ans[i] = temp;
                    temp = 0;
                    stx = sp[0];
                    sty = sp[1];
                    break;
                }
                else if(j==s.length()-1){
                    temp++;
                     ans[i] = temp;
                    temp = 0;
                    stx = sp[0];
                    sty = sp[1];
                    break;
                }
                else{
                    temp++;
                }
            }
        }
        
        return ans;
    }
}
