class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int mx = -1;
        int mxInd = -1;
        
        for(int i = 0; i<arr.length; i++){
            
            if(mx <= arr[i]){
                mx = arr[i];
                mxInd = i;
            }
            
        }
        
        boolean flag = true;
        
        for(int i = 0; i<mxInd; i++){
            if(arr[i] < arr[i+1]){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        
        boolean flag2 = true;
        
        for(int i = mxInd; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                flag2 = true;
            }
            else{
                flag2 = false;
                break;
            }
        }
        
        if(arr.length <3){
            return false;
        }
        
        if(flag && flag2 && mxInd != arr.length-1 && mxInd != 0){
            return true;
        }
        else{
            return false;
        }
        
    }
}