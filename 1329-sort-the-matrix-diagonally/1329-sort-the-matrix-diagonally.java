class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        for(int k = mat.length-1; k>-1; k--){
            
            ArrayList<Integer> d = new ArrayList<>();
            
            for(int i = k, j = 0; i<mat.length && j<mat[0].length; i++, j++){
                d.add(mat[i][j]);
            }
            Collections.sort(d);
            int it = 0;
            for(int i = k, j = 0; i<mat.length && j<mat[0].length; i++, j++){
                mat[i][j] = d.get(it);
                it++;
            }
            
            d.clear();
            
        }
        
        for(int k = mat[0].length-1; k>-1; k--){
            
            ArrayList<Integer> d = new ArrayList<>();
            
            for(int i = 0, j = k; i<mat.length && j<mat[0].length; i++, j++){
                d.add(mat[i][j]);
            }
            Collections.sort(d);
            int it = 0;
            for(int i = 0, j = k; i<mat.length && j<mat[0].length; i++, j++){
                mat[i][j] = d.get(it);
                it++;
            }
            
            d.clear();
            
        }
        
        return mat;
        
    }
}