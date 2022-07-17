class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        
        for(int i = 0; i<n-1; i++){
            
            int mxInd = -1;
            int mx = -1;
            
            for(int j = i+1; j<n; j++){
                
                if(mx <= arr[j]){
                    mx = arr[j];
                    mxInd = j;
                }
                
            }
            
            for(int j = i; j<mxInd; j++){
                arr[j] = mx;
            }
            
        }
        
        arr[n-1] = -1;
        
        return arr;
        
    }
}