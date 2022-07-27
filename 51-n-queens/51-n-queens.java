class Solution {
    
    List<List<String>> ans = new ArrayList<>();
    int num = -1;
    
    public void listCreator(int [][] board){
        
         ans.add(new ArrayList<>());
        
        for(int i = 0; i<board.length; i++){
            String a = "";
            for(int j = 0; j<board.length; j++){
                if(board[i][j] == 0){
                    a = a + '.';
                }
                else {
                    a = a + 'Q';
                }
            }
            ans.get(num).add(a);
        }
        
    }
    
    public List<List<String>> solveNQueens(int n) {
        
        int [][] board = new int [n][n];
        solver(board, 0);
        return ans;
    }
    
    public void solver(int [][] board, int row){
        
        if(row == board.length){
            num++;
            listCreator(board);
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