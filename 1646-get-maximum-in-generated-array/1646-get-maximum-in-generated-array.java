class Solution {
    public int getMaximumGenerated(int n) {
        
        int [] arr = new int [n+1];
        
        int mn = Integer.MIN_VALUE;
        
        for(int i = 0; i<=n; i++){
            
            if(i == 0 || i == 1){
                arr[i] = i;
                mn = Math.max(arr[i], mn);
            }
            else if(i%2==0){
                arr[i] = arr[i/2];
                mn = Math.max(arr[i], mn);
            }
            else{
                arr[i] = arr[i/2] + arr[(i/2)+1];
                mn = Math.max(arr[i], mn);
            }
            
        }
        
        return mn;
        
    }
}