class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        
        int [] a = new int [nums.length+1];
        
        int mx = -1;
        
        int z = 0;
        int o = 0;
        
        int [] b = new int [nums.length+1];
        
        int [] sc = new int [nums.length+1];
        
        for(int i = 1; i<a.length; i++){
            if(nums[i-1] == 0){
                z++;
            }
            a[i] = z;
        }
        
        for(int i = b.length-2; i>-1; i--){
            if(nums[i] == 1){
                o++;
            }
            b[i] = o;
        }
        
        for(int i = 0; i<sc.length; i++){
            sc[i] = a[i]+b[i];
            mx = Math.max(mx, sc[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i<sc.length; i++){
            if(mx == sc[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}