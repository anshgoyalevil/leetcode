class Solution {
    public int compareVersion(String version1, String version2) {
        
        String [] v1 = version1.split("\\.");
        String [] v2 = version2.split("\\.");
        
        int [] v1i = new int [v1.length];
        int [] v2i = new int [v2.length];
        
        for(int i = 0; i<v1i.length; i++){
            v1i[i] = Integer.parseInt(v1[i]);
        }
        for(int i = 0; i<v2i.length; i++){
            v2i[i] = Integer.parseInt(v2[i]);
        }
        
        int i = 0;
        
        // for(int e: v1i){
        //     System.out.print(e+" ");
        // }
        // System.out.println();
        // for(int e: v2i){
        //     System.out.print(e+" ");
        // }
        int a = 0;
        int b = 0;
        while(i<v1i.length || i<v2i.length){
            if(i>=v1i.length){
                a = 0;
            }
            else{
                a = v1i[i];
            }
            if(i>=v2i.length){
                b = 0;
            }
            else{
                b = v2i[i];
            }
            if(a > b){
                return 1;
            }
            else if(a < b){
                return -1;
            }
            i++;
        }
        
        return 0;
        
    }
}