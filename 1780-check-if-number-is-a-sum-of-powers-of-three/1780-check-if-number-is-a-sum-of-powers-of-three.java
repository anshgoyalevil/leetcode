class Solution {
    public boolean checkPowersOfThree(int n) {
        
        while(n>1){
            if(n%3==0){
                n=n/3;
            }
            else if(n%3 == 1){
                n=n-1;
            }
            else {
                return false;
            }
        }
        return true;
    }
}