class Solution {
    public int minimumSum(int num) {
        
        String n = String.valueOf(num);
        
        int [] arr = new int [4];
        
         arr[0] = Character.getNumericValue(n.charAt(0));
         arr[1] = Character.getNumericValue(n.charAt(1));
         arr[2] = Character.getNumericValue(n.charAt(2));
         arr[3] = Character.getNumericValue(n.charAt(3));
        
        Arrays.sort(arr);
        
        return (arr[0]*10 + arr[3] + arr[1]*10 + arr[2]);
        
    }
}