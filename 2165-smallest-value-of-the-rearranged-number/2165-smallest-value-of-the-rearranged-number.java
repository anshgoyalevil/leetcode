class Solution {

    public long smallestNumber(long num) {
        String s = num + "";
        String ans = "";

        int[] arr = new int[10];

        if (s.charAt(0) == '-') {
            for (int i = 1; i < s.length(); i++) {
                arr[s.charAt(i) - '0']++;
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - '0']++;
            }
        }

        if (num <= 0) {
            ans += '-';
            for (int i = 9; i > -1; i--) {
                for (int j = 0; j < arr[i]; j++) {
                    ans += (char) (i + '0');
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if (arr[i] > 0) {
                    ans += (char) (i + '0');
                    arr[i]--;
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < arr[i]; j++) {
                    ans += (char) (i + '0');
                }
            }
        }
        return Long.parseLong(ans);
    }
}
