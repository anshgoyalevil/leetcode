class Solution {

    public int reinitializePermutation(int n) {
        int ops = 0;

        int[] org = new int[n];
        int[] mod = new int[n];
        int[] asn = new int[n];

        for (int i = 0; i < n; i++) {
            org[i] = i;
            mod[i] = i;
        }

        for (int i = 0; i < n; i++) {
            ops++;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    asn[j] = org[j / 2];
                } else {
                    asn[j] = org[n / 2 + (j - 1) / 2];
                }
            }
            if (Arrays.equals(asn, mod)) {
                break;
            }
            for (int j = 0; j < n; j++) {
                org[j] = asn[j];
            }
        }

        return ops;
    }
}
