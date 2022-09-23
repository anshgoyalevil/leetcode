class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int ans = 0;
        
        int PE = 0;
        int GE = 0;
        int ME = 0;
        int p = 0;
        int g = 0;
        int m = 0;
        
        for(int i = 0; i<travel.length-1; i++){
            travel[i+1]+=travel[i];
        }
        
        for(int i = 0; i<garbage.length; i++){
            for(int j = 0; j<garbage[i].length(); j++){
                if(garbage[i].charAt(j) == 'P'){
                    p++;
                    PE = i;
                }
                else if(garbage[i].charAt(j) == 'G'){
                    g++;
                    GE = i;
                }
                else if(garbage[i].charAt(j) == 'M'){
                    m++;
                    ME = i;
                }
            }
        }
        
        ans=g+m+p;
        
        if(PE-1 != -1){
            ans+=travel[PE-1];
        }
        if(GE-1 != -1){
            ans+=travel[GE-1];
        }
        if(ME-1 != -1){
            ans+=travel[ME-1];
        }
        return ans;
    }
}