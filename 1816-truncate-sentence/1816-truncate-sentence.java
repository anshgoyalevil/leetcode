class Solution {
    public String truncateSentence(String s, int k) {
        
        String [] arr = s.split("\\s+");
        
        String ans = "";
        
        for(int i = 0; i<k; i++){
            if(i!=k-1){
                ans+=arr[i] + " ";
            }
            else{
                ans+=arr[i];
            }
        }
        return ans;     
    }
}