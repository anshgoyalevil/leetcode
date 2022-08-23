class Solution {
    public boolean canCross(int[] stones) {
        
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        
        for(int i = 0; i<stones.length; i++){
            hm.put(stones[i], new HashSet<>());
        }
        
        hm.get(stones[0]).add(1);
        
        for(int i = 0; i<stones.length; i++){
            int currStone = stones[i];
            HashSet<Integer> jumps = hm.get(currStone);
            
            for(int jump: jumps){
                int pos = currStone + jump;
                if(pos == stones[stones.length-1]){
                    return true;
                }
                if(hm.containsKey(pos)){
                    if(jump-1>0){
                        hm.get(pos).add(jump-1);
                    }
                    hm.get(pos).add(jump);
                    hm.get(pos).add(jump+1);
                }
            }
            
        }
        
        return false;
        
    }
}