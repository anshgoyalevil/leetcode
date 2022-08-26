class Solution {
    public boolean reorderedPowerOf2(int n) {
        
        int m = 1;
        boolean f = true;
        String inp = String.valueOf(n);
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> org = new HashMap<>();
        
        for(int i = 0; i<inp.length(); i++){
            org.put(inp.charAt(i), org.getOrDefault(inp.charAt(i), 0)+1);
        }
                
        for(int i = 0; i<31; i++){
            int ans = m<<i;
            String str = String.valueOf(ans);
            for(int j = 0; j<str.length(); j++){
                hm.put(str.charAt(j), hm.getOrDefault(str.charAt(j), 0)+1);
            }
            int r = 0;
            for(Map.Entry<Character, Integer> e: hm.entrySet()){
                if(org.containsKey(e.getKey()) && org.get(e.getKey()) == e.getValue()){
                    r++;
                }
                else{
                    break;
                }
            }
            
            if(r == hm.size() && r == org.size()){
                //System.out.println(r+ " "+hm.size() + " " + org.size());
               //System.out.println(hm + " " + org);
                return true;
            }
            else{
                hm.clear(); 
            }
            
        }
        return false;
    }
}