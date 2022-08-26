class Solution {

    public String addBinary(String a, String b) {
        int rem = 0;

        String ans = "";

        int a1 = 0;
        int a2 = 0;

        int r1 = a.length() - 1;
        int r2 = b.length() - 1;

        while (r1 >= 0 || r2 >= 0) {
            if (r1 < 0 && r2 >= 0) {
                a1 = 0;
                a2 = b.charAt(r2) - 48;
            } else if (r2 < 0 && r1 >= 0) {
                a2 = 0;
                a1 = a.charAt(r1) - 48;
            } else {
                a1 = a.charAt(r1) - 48;
                a2 = b.charAt(r2) - 48;
            }

            

            ans = ((char) (((a1 + a2 + rem) % 2) + 48)) + ans;
            
            rem = (a1 + a2 + rem) / 2;
            
            //System.out.println(ans);

            r1--;
            r2--;
        }
        if(rem!=0){
            ans = '1'+ans;
        }
        return ans;
    }
}
