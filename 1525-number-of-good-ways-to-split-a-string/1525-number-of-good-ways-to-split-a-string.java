class Solution {
    public int numSplits(String s) {
                
        HashMap<Character, Integer> l = new HashMap<>();
        HashMap<Character, Integer> r = new HashMap<>();
        
        int ans = 0;
        
        for(int i = 0; i<s.length(); i++){
            r.put(s.charAt(i), r.getOrDefault(s.charAt(i), 0)+1);
        }
        
        int it = 0;
        
        for(int i = 0; i<s.length(); i++){
            l.put(s.charAt(i), l.getOrDefault(s.charAt(i), 0)+1);
            if(r.get(s.charAt(i)) == 1){
                r.remove(s.charAt(i));
            }
            else{
                r.put(s.charAt(i), r.get(s.charAt(i)) - 1);
            }
            if(l.size() == r.size()){
                ans++;
            }
        }
        return ans;
    }
}