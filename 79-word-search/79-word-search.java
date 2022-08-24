class Solution {
    
    boolean ans = false;
    
    public boolean t(){
        return true;
    }
    
    public void f(char[][] board, String psf, int n, int m, int [][] vis, String word, int ind){
        
        if(n<0 || m<0 || n>=board.length || m>=board[0].length || vis[n][m] == -1 || ind>=word.length()){
            return;
        }
        if(board[n][m] != word.charAt(ind)){
            return;
        }
        if((psf+board[n][m]).equals(word)){
            ans = true;
            t();
            return;
        }
        
        vis[n][m] = -1;
        f(board, psf+board[n][m], n+1, m, vis, word, ind+1);
        f(board, psf+board[n][m], n-1, m, vis, word, ind+1);
        f(board, psf+board[n][m], n, m+1, vis, word, ind+1);
        f(board, psf+board[n][m], n, m-1, vis, word, ind+1);
        vis[n][m] = 0;
                
    }
    
    public boolean exist(char[][] board, String word) {
        
        int [][] vis = new int [board.length][board[0].length];
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    f(board, "", i, j, vis, word, 0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}