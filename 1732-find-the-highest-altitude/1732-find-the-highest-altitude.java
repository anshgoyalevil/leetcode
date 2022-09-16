class Solution {
    public int largestAltitude(int[] gain) {
        int m = 0;
        m = Math.max(m, gain[0]);
        for(int i = 1; i<gain.length; i++){
            gain[i] = gain[i-1] + gain[i];
            m = Math.max(gain[i], m);
        }
        return m;
    }
}