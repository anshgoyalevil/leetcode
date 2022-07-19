class Solution {
    public void setZeroes(int[][] matrix) {
       
        int row = matrix.length;
        int col = matrix[0].length;
         if(matrix == null || row == 0 || col == 0 ){
            return;
        }
        boolean isFirstRowZero = false , isFirstColumnZero = false;
        for(int i=0;i<row;++i){
            if(matrix[i][0] == 0){
                isFirstColumnZero = true;
                break;
            }
        }
            
            for(int j=0;j<col;++j){
            if(matrix[0][j] == 0){
                isFirstRowZero = true;
                break;
            }
        
        }
        
            for(int i = 1; i< row;++i){
                for(int j=1;j<col;++j){
                    if(matrix[i][j] == 0){
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
            
            for(int i=1;i<row;++i){
                for(int j=1;j<col;++j){
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                      matrix[i][j] = 0;
                    
                    }
                    
                }
            }
            
            if(isFirstRowZero){
                for(int j=0;j<col;++j){
                    matrix[0][j] = 0;
                }
            }
            
             if(isFirstColumnZero){
                for(int i=0;i<row;++i){
                    matrix[i][0] = 0;
                }
            }
    }
}