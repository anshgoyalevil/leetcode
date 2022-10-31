class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isToeplitz = true;
        
        for (int i = 0; i < m; i++) {
            int r = i, c = 0;
            int val = matrix[r][c];
            while (r < m && c < n) {
                if (matrix[r][c] != val) {
                    isToeplitz = false;
                    break;
                }
                r++; c++;
            }
            if (!isToeplitz)
                break;
        }
        
        if (isToeplitz) {
            for (int j = 0; j < n; j++) {
                int r = 0, c = j;
                int val = matrix[r][c];
                while (r < m && c < n) {
                    if (matrix[r][c] != val) {
                        isToeplitz = false;
                        break;
                    }
                    r++; c++;
                }
                if (!isToeplitz)
                    break;
            }
        }
        
        return isToeplitz;
    }
}