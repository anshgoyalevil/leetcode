class Solution {

    public int largestCombination(int[] candidates) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0; i<candidates.length; i++){
            for(int j = 0; j<32; j++){
                if(((1<<j)&(candidates[i])) != 0){
                    hm.put(j, hm.getOrDefault(j, 0)+1);
                }
            }
        }
        
        int mx = 0;
        for(Map.Entry<Integer, Integer> e: hm.entrySet()){
            mx = Math.max(mx, e.getValue());
        }
        
        System.out.println(hm);
        return mx;
    }
    
}
