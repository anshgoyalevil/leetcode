class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        int n = num;
        StringBuilder sb = new StringBuilder();
		
        while (n >= 0) {
            String str = sb.append(n).reverse().toString();
            Integer temp = Integer.valueOf(str);
            
            if (n + temp == num) {
                return true;
            }
            n--;
            sb.setLength(0);
        }
        return false;
    }
}