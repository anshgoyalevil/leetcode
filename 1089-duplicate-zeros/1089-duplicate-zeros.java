class Solution {
    public void duplicateZeros(int[] arr) {
        
        int zeros = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                zeros++;
            }
        }
        
        int ins = 0;
        
        int [] arrNew = new int[arr.length + zeros*2];
        
        int a = 0;
        
        for(int i = 0; i<arr.length;){
            if(arr[i] == 0){
                arrNew[a] = 0;
                arrNew[a+1] = 0;
                a = a+2;
                i++;
            }
            else{
                arrNew[a] = arr[i];
                a = a+1;
                i++;
            }
        }
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = arrNew[i];
        }
        
    }
}