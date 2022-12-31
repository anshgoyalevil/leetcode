class Solution {

    public int numTeams(int[] rating) {
        int n = rating.length;
        int[] ct1 = new int[rating.length];
        int[] ct2 = new int[rating.length];
        for (int i = 1; i < n; i++) {
            int ctl = 0, ctg = 0;
            for (int j = i + 1; j < n; j++) {
                if (rating[j] > rating[i]) ctg++;
                if (rating[j] < rating[i]) ctl++;
            }
            ct1[i] = ctl;
            ct2[i] = ctg;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rating[j] < rating[i]) {
                    sum = sum + ct1[j];
                }
                if (rating[j] > rating[i]) {
                    sum = sum + ct2[j];
                }
            }
        }
        return sum;
    }
}
