class Solution {
    public char[][] rotateTheBox(char[][] box) {
        
        char [][] ans = new char [box[0].length][box.length];
        
        for(int i = 0; i<box.length; i++){
            int dm = 0;
            for(int j = 0; j<box[0].length; j++){
                if(box[i][j] == '*'){
                    for(int k = j-1; k>-1; k--){
                        if(dm>0){
                            box[i][k] = '#';
                            dm--;
                        }
                        else{
                            break;
                        }
                    }
                }
                else{
                    if(box[i][j] == '#'){
                        dm++;
                        box[i][j] = '.';
                    }
                }
            }
            for(int k = box[0].length-1; k>-1; k--){
                        if(dm>0){
                            box[i][k] = '#';
                            dm--;
                        }
                        else{
                            break;
                        }
                    }
        }
        
        // for(int i = 0; i<box.length; i++){
        //     for(int j = 0; j<box[0].length; j++){
        //         System.out.print(box[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        for(int i = 0; i<box.length; i++){
            for(int j = 0; j<box[0].length; j++){
                ans[j][box.length - i - 1] = box[i][j];
            }
        }
        
        return ans;
        
    }
}