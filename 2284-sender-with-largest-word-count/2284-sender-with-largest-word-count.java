class Solution {
    public String largestWordCount(String[] m, String[] s) {
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        String lg = "";
        int mx = -1;
        
        for(int i = 0; i<m.length; i++){
            int sp = 1;
            for(int j = 0; j<m[i].length(); j++){
                if(Character.isWhitespace(m[i].charAt(j))){
                    sp++;
                }
            }
            if(hm.containsKey(s[i])){
                hm.put(s[i], hm.get(s[i])+sp);
            }
            else{
                hm.put(s[i], sp);
            }
        }
        
        for(Map.Entry<String, Integer> e: hm.entrySet()){
            if(mx<e.getValue()){
                mx = e.getValue();
                lg = e.getKey();
            }
            else if(mx == e.getValue()){
                if(lg.compareTo(e.getKey()) < 0){
                    lg = e.getKey();
                }
            }
        }
        return lg;
    }
}