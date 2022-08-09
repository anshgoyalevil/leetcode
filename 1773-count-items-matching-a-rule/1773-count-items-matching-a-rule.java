class Solution {
    public int countMatches(List<List<String>> items, String k, String v) {
        
        int si = -1;
        
        if(k.equals("type")){
            si = 0;
        }
        else if(k.equals("color")){
            si = 1;
        }
        else if(k.equals("name")){
            si = 2;
        }
        
        int a = 0;
        
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).get(si).equals(v)){
                a++;
            }
        }
        return a;
    }
}