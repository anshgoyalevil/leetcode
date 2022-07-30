class Solution {
    public int numberOfBeams(String[] bank) {
        
        int ans = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<bank.length; i++){
            int x = 0;
            for(int j = 0; j<bank[i].length(); j++){
                if(bank[i].charAt(j) == '1'){
                    x++;
                }
            }
            if(x!=0){
            arr.add(x);
            }
        }
        
        for(int i = 0; i<arr.size()-1; i++){
            ans = ans + arr.get(i+1)*arr.get(i);
        }
        
        return ans;
        
    }
}