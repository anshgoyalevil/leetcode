class Solution {

    static int gc(int n) {
        return n ^ (n >> 1);
    }

    static int igc(int n) {
        int inv = 0;

        for (; n != 0; n = n >> 1) {
            inv ^= n;
        }

        return inv;
    }

    public List<Integer> circularPermutation(int n, int start) {
        
        List<Integer> ans = new ArrayList<>();
        
        int ls = (int) Math.pow(2, n);
        
        int r = igc(start);
        
        for (int i = 0; i < ls; i++) {
            ans.add(gc(r % ls));
            r++;
        }
        return ans;
    }
}
