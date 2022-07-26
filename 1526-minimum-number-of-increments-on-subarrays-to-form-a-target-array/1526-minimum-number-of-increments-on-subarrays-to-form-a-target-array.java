class Solution {
    public int minNumberOperations(int[] target) {
        int total=target[0],n=target.length;
        for(int i=1;i<n;i++){
            if(target[i]>target[i-1]){
                total+=target[i]-target[i-1];
            }
        }
        return total;
    }
}