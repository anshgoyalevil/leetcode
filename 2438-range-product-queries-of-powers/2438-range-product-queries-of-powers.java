class Solution {
    double m = 1e9+7;
    public int[] productQueries(int n, int[][] queries) {

        LinkedList<Integer> x = new LinkedList<>();
        int c = 0;
        while(n>0){
           if((n&1) == 1)
           x.add(c);
           c++;
           n>>=1; 
        }
        
        int sz = x.size();
        for(int i=1;i<sz;i++){
            x.set(i,x.get(i-1)+x.get(i));
        }
        x.addFirst(0);

        int[] res = new int[queries.length];
        int i=0;
        for(int[] q: queries){

            int s = x.get(q[1]+1)-x.get(q[0]);
            res[i]= (int)(Math.pow(2,s)%m);
            i++;
        }
        return res;
    }
}