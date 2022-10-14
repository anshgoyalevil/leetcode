class Solution {
    public int maximumScore(int a, int b, int c) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int ans = 0;
        
        pq.add(a);
        pq.add(b);
        pq.add(c);
        
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            
            x--;
            y--;
            
            if(x>0){
                pq.add(x);
            }
            if(y>0){
                pq.add(y);
            }
            
            ans++;
            
        }
        return ans;
    }
}