class Solution {
    public int minSteps(String s, String t) {
        
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        
        int ans = 0;
        
        for(int i = 0; i<s.length(); i++){
            h1.put(s.charAt(i), h1.getOrDefault(s.charAt(i), 0)+1);
        }
        
        for(int i = 0; i<t.length(); i++){
            h2.put(t.charAt(i), h2.getOrDefault(t.charAt(i), 0)+1);
        }
        
        for(Map.Entry<Character, Integer> e: h1.entrySet()){
            if(h2.containsKey(e.getKey())){
                ans+=Math.abs(h1.get(e.getKey())-h2.get(e.getKey()));
                h2.remove(e.getKey());
            }
            else{
                ans+=e.getValue();
            }
        }
        
        for(Map.Entry<Character, Integer> e: h2.entrySet()){
            if(h1.containsKey(e.getKey())){
                ans+=Math.abs(h1.get(e.getKey())-h2.get(e.getKey()));
            }
            else{
                ans+=e.getValue();
            }
        }
        return ans;
    }
}