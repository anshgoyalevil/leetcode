class Solution {
    
    int [] arr;
    
    public int[] findBall(int[][] grid) {
        arr = new int [grid[0].length];
        Arrays.fill(arr, 101);
        for(int i = 0; i<grid[0].length; i++){
            f(grid, i, 0, i);
            if(arr[i] == 101){
                arr[i] = -1;
            }
        }
        return arr;
    }
    
    public void f(int [][] grid, int idx, int a, int b){
        
        if(a == grid.length){
            arr[idx] = b;
            return;
        }
        
        if(b<0 || b>=grid[0].length){
            arr[idx] = -1;
        }
        
        if(grid[a][b] == 1 && b<grid[0].length-1 && grid[a][b+1] == 1){
            f(grid, idx, a+1, b+1);
        }
        if(grid[a][b] == -1 && b>0 && grid[a][b-1] == -1){
            f(grid, idx, a+1, b-1);
        }
        
    }
    
}