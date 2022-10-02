class Solution {

    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int ans[] = new int[m + n]; //max possible size of prod
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int prod = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int temp = ans[i + j + 1] + prod; // to store carry
                ans[i + j] += temp / 10;
                ans[i + j + 1] = temp % 10;
            }
        }
        StringBuilder st = new StringBuilder();
        for (int i : ans) {
            if (
                i != 0 || st.length() != 0
            ) st.append(i);
        }
        if (st.length() == 0) return "0";
        return st.toString();
    }
}
