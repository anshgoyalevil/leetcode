class Solution {
    public void rotate(int[][] matrix) {
        
        int a = 0;
        int b = 1;
        
        for(int i = a; i<matrix.length; i++){
            for(int j = b; j<matrix.length; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
            a++;
            b++;
        }
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<(matrix.length+1)/2; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
        
    }
}