class Solution {
    public List<Integer> grayCode(int n) {
        
        List<Integer> l = new ArrayList<>();
        
        int p = (int)Math.pow(2, n);
        
        for(int i = 0; i<p; i++){
            String bin = Integer.toBinaryString(i);
            String g = "";
            g+=bin.charAt(0);
            for(int j = 0; j<bin.length()-1; j++){
                g+=(bin.charAt(j)-'0')^(bin.charAt(j+1)-'0');
            }
            l.add(Integer.parseInt(g,2));
        }
        return l;
    }
}