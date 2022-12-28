class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<piles.length; i++){
            q.add(piles[i]);
        }
        while(k>0){
            int p = q.poll();
            int r = p;
            r = r-(p/2);
            q.add(r);
            k--;
        }
        int s = 0;
        while(!q.isEmpty()){
            s+=q.poll();
        }
        return s;
    }
}