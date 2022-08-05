class Solution {
    public String restoreString(String s, int[] indices) {
        
        String ans = "";
        
        HashMap<Integer, Character> h = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            h.put(indices[i], s.charAt(i));
        }
        
        for(int i = 0; i<s.length(); i++){
            ans+=h.get(i);
        }
        
        return ans;
        
    }
}