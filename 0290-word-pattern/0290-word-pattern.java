class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String [] strArr = s.split("\\s+");
        
        HashMap<Character, String> hm = new HashMap<>();
        
        if(strArr.length != pattern.length()){
            return false;
        }
        
        for(int i = 0; i<pattern.length(); i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(strArr[i])){
                    return false;
                }
            }
            else{
                if(hm.containsValue(strArr[i])){
                    return false;
                }
                hm.put(pattern.charAt(i), strArr[i]);
            }
        }
        
        return true;
        
    }
}