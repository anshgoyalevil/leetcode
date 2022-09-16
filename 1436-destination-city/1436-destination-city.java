class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String, String> hm = new HashMap<>();
        
        for(int i = 0; i<paths.size(); i++){
            hm.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        
        for(Map.Entry<String, String> e: hm.entrySet()){
            if(!hm.containsKey(e.getValue())){
                return e.getValue();
            }
        }
        return "";
    }
}