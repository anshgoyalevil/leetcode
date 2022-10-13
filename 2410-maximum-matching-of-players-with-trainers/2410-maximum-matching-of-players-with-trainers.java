class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
                
        int ans = 0;
        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        
        for(int i = 0; i<t.length; i++){
            tm.put(t[i], tm.getOrDefault(t[i], 0)+1);
        }
        
        for(int i = 0; i<p.length; i++){
            if(tm.ceilingKey(p[i]) != null){
                ans++;
                int a = tm.ceilingKey(p[i]);
                int b = tm.get(a);
                if(b == 1){
                    tm.remove(a);
                }
                else{
                    tm.put(a, b - 1);
                }
            }
        }
        return ans;
    }
}