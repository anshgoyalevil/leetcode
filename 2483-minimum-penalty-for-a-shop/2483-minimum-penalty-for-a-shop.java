class Solution {
    public int bestClosingTime(String c) {
        int [] n = new int [c.length()+1];
        int [] y = new int [c.length()+1];
        
        for(int i = 1; i<n.length; i++){
            if(c.charAt(i-1) == 'N'){
                n[i] = n[i-1] + 1;
            }
            else{
                n[i] = n[i-1];
            }
        }
        
        for(int i = y.length-2; i>-1; i--){
            if(c.charAt(i) == 'Y'){
                y[i] = y[i+1] + 1;
            }
            else{
                y[i] = y[i+1];
            }
        }
        
        int mn = Integer.MAX_VALUE;
        int id = -1;
        
        for(int i = 0; i<n.length; i++){
            int r = n[i]+y[i];
            if(r<mn){
                mn = r;
                id = i;
            }
        }
        
        // for(int i = 0; i<n.length; i++){
        //     System.out.println(n[i] + " " + y[i]);
        // }
        
        return id;
        
    }
}