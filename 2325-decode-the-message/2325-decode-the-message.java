class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character, Character> hm = new HashMap<>();
        
        char init = 'a';
        
        for(int i = 0; i<key.length(); i++){
            if(!Character.isWhitespace(key.charAt(i))){
                if(!hm.containsKey(key.charAt(i))){
                    hm.put(key.charAt(i), init);
                    init++;
                }
            }
        }
        
        StringBuilder str = new StringBuilder(message);
        
        for(int i = 0; i<message.length(); i++){
            if(!Character.isWhitespace(message.charAt(i))){
                str.setCharAt(i, hm.get(message.charAt(i)));
            }
        }
        
        return str.toString();
        
    }
}