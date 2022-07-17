class Solution {
    
    public boolean checkIfExist(int[] arr) {
        
        boolean flag = false;
        
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length; j++){
                
                if(i == j)continue;
                if(arr[i] == 2*arr[j]){
                    return true;
                }
                
            }
        }
        
        return false;
        
    }
}