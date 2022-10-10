class Solution {
    public int commonFactors(int a, int b) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 1; i<=a; i++){
            if(a%i == 0){
                int one = a/i;
                int two = i;
                hs.add(one);
                hs.add(two);
            }
        }
        
        int c = 0;
        
        for(int i = 1; i<=b; i++){
            if(b%i == 0){
                if(hs.contains(i)){
                    c++;
                    hs.remove(i);
                }
            }
        }
        return c;
    }
}