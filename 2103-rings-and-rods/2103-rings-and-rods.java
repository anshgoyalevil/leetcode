class Solution {
    public int countPoints(String rings) {
        
        ArrayList<HashSet<Character>> arr = new ArrayList<>(10);
        
        for(int i = 0; i<10; i++){
            arr.add(new HashSet<Character>());
        }
        
        for(int i = 0; i<rings.length(); i+=2){
            arr.get(rings.charAt(i+1) - '0').add(rings.charAt(i));
        }
        
        int ans = 0;
        
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i).size() == 3){
                ans++;
            }
        }
        return ans;
    }
}