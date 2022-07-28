class Solution {
    public int[] minOperations(String boxes) {
        
        int [] ans = new int [boxes.length()];
        
        int sum = 0;
        int total = 0;
        int back = 0;
        int sumBack = 0;
        
        for(int i = 0; i<boxes.length(); i++){
            if(boxes.charAt(i) == '1'){
                sum+=i;
                total++;
            }
        }
        
        for(int i = 0; i<boxes.length(); i++){
            if(boxes.charAt(i) == '1'){
                
                ans[i] = Math.abs(sum - i*total) + Math.abs(sumBack - i*back);
                sumBack+=i;
                sum-=i;
                System.out.println(sum + " " + sumBack);
                System.out.println(i + " " + total + " " + back);
                total--;
                back++;
            }
            else{
                ans[i] = Math.abs(sum - i*total) + Math.abs(sumBack - i*back);
            }
        }
        
        return ans;
        
    }
}