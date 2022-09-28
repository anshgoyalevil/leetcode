class Solution {
    public int[][] generateMatrix(int n) {
        int it = 1;
        int [][] matrix = new int[n][n];
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int right = c - 1;
        int bottom = r - 1;
        int left = 0;

        List<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                matrix[top][i] = it;
                it++;
                                                }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = it;
                it++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i]=it;
                    it++;
                                                    }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = it;
                    it++;
                }
                left++;
            }
        }
        return matrix;
    }
}