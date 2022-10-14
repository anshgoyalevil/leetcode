class Solution {
    public int maximumXOR(int[] nums) {
                
        int mxInd = -1;
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<31; j++){
                if((nums[i]&(1<<j)) != 0){
                    mxInd = Math.max(mxInd, j);
                    hs.add(j);
                }
            }
        }
        
        String bin = "";
        
        for(int i = mxInd; i>-1; i--){
            if(hs.contains(i)){
                bin+='1';
            }
            else{
                bin+='0';
            }
        }
        //System.out.println(bin);
        if(bin.equals("")){
            return 0;
        }
        return Integer.parseInt(bin, 2);
    }
}