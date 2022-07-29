class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int ans[] = new int[n];
        
        Deque<Integer> dq = new ArrayDeque<Integer>();
        
        for(int i=0; i<n; i++){
            
            while(!dq.isEmpty() && temperatures[i] > temperatures[dq.peek()]){
                ans[dq.peek()] = i - dq.peek();
                dq.pop();
            }
            
            dq.push(i);
        }
        
        return ans;
    }
    
}