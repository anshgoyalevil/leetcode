class Solution {
    public long dividePlayers(int[] skill) {
        
        long ans = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int k = 0;
        
        for(int i = 0; i<skill.length; i++){
            hm.put(skill[i], hm.getOrDefault(skill[i], 0)+1);
            k+=skill[i];
        }
        
        k=(k/(skill.length/2));
        
        for(int i = 0; i<skill.length; i++){
            if(hm.containsKey(skill[i])){
                if(hm.containsKey(k-skill[i])){
                    ans+=skill[i]*(k-skill[i]);
                    if(hm.containsKey(skill[i]) && hm.get(skill[i]) == 1){
                        hm.remove(skill[i]);
                    }
                    else if(hm.containsKey(skill[i])){
                        hm.put(skill[i], hm.get(skill[i])-1);
                    }
                    if(hm.containsKey(k-skill[i]) && hm.get(k-skill[i]) == 1){
                        hm.remove(k-skill[i]);
                    }
                    else if(hm.containsKey(k-skill[i])){
                        hm.put(k-skill[i], hm.get(k-skill[i])-1);
                    }
                }
            }
        }
        
        if(hm.size() == 0){
            return ans;
        }
        return -1;
        
    }
}