class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> hs = new HashSet<>();
        
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(hs.contains(board[i][j]) && board[i][j]!='.'){
                    return false;
                }
                else{
                    hs.add(board[i][j]);
                }
            }
            hs.clear();
        }
        hs.clear();
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(hs.contains(board[j][i]) && board[j][i]!='.'){
                    return false;
                }
                else{
                    hs.add(board[j][i]);
                }
            }
            hs.clear();
        }
        hs.clear();
        /////////
        int num = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        
        /////////////
        for(int i = 3; i<6; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        ////////
        for(int i = 6; i<9; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        
        ////////
        for(int i = 0; i<3; i++){
            for(int j = 3; j<6; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        /////////
        for(int i = 3; i<6; i++){
            for(int j = 3; j<6; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        //////////
        for(int i = 6; i<9; i++){
            for(int j = 3; j<6; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        //////////
        for(int i = 0; i<3; i++){
            for(int j = 6; j<9; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        /////////////
        for(int i = 3; i<6; i++){
            for(int j = 6; j<9; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        ///////////
        for(int i = 6; i<9; i++){
            for(int j = 6; j<9; j++){
                if(board[i][j] != '.'){
                    hs.add(board[i][j]);
                    num++;
                }
            }
        }
        if(num!=hs.size()){
            return false;
        }
        
        num = 0;
        hs.clear();
        
        return true;
    }
}