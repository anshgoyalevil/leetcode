class Solution {
    public int[] processQueries(int[] q, int m) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 1; i<=m; i++){
            arr.add(i);
        }
        
        int [] ans = new int [q.length];
        
        for(int i = 0; i<q.length; i++){
            for(int j = 0; j<m; j++){
                if(arr.get(j) == q[i]){
                    arr.remove(j);
                    ans[i] = j;
                    break;
                }
            }
            arr.add(0, q[i]);
        }
        return ans;
    }
}