class Solution {

    public int longestSquareStreak(int[] nums) {
            
        TreeSet<Long> ts = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            ts.add((long)nums[i]);
        }

        HashMap<Long, Integer> hm = new HashMap<>();

        int mx = -1;

        for (int i = 0; i < nums.length; i++) {
            hm.put((long)nums[i], 1);
        }

        for (long e: ts) {
            long r = (e*e);
            if (ts.contains(r)) {
                mx = Math.max(mx, hm.get(e) + hm.get(r));
                int s = hm.get(e);
                hm.put(e, hm.get(e) + hm.get(r));
                hm.put(r, s + hm.get(r));
                //System.out.println(hm + " " + ts);
            }
        }
        
        return mx;
    }
}
