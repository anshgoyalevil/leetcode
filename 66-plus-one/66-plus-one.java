class Solution {
    public int[] plusOne(int[] digits) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        int rem = 1;
        
        for(int i = digits.length-1; i>-1; i--){
            int a = (digits[i] + rem)%10;
            rem = (digits[i] + rem)/10;
            arr.add(a);
        }
        
        if(rem != 0){
            arr.add(rem);
        }
        
        int [] ans = new int[arr.size()];
        
        for(int i = 0; i<arr.size(); i++){
            ans[i] = arr.get(arr.size() - i - 1);
        }
        
        return ans;
        
    }
}