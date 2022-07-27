class Solution {
    
    int num = 0;
    
    public int totalNQueens(int n) {
        
        int [][] board = new int [n][n];
        solver(board, 0);
        return num;
    }
    
    public void solver(int [][] board, int row){
        
        if(row == board.length){
            num++;
            return;
        }
        
        for(int i = 0; i<board.length; i++){
            if(isSafe(board, row, i)){
            board[row][i] = 1;
            solver(board, row+1);
            board[row][i] = 0;
            }
        }
        
    }
    
    public boolean isSafe(int [][] board, int row, int col){
        
        for(int i = row-1, j = col; i>=0; i--){
            if(board[i][j] == 1){
                return false;
            }
        }
        
        for(int i = row-1, j = col-1; i>-1 && j>-1; i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i = row-1, j = col+1; i>-1 && j<board.length; i--, j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        
        return true;
        
    }
    
}