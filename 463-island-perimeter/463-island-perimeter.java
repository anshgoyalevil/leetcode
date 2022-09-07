class Solution {

    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 && j == 0) {
                    if (grid[i][j] == 1) {
                        p += 2;
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 0) {
                            p += 1;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 0) {
                            p += 1;
                        }
                        if(i == grid.length-1){
                            p+=1;
                        }
                        if(j == grid[0].length-1){
                            p+=1;
                        }
                    }
                } else if (i == 0 && j != 0 && j!= grid[0].length-1) {
                    if (grid[i][j] == 1) {
                        p += 1;
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 0) {
                            p += 1;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 0) {
                            p += 1;
                        }
                        if (j - 1 > -1 && grid[i][j - 1] == 0) {
                            p += 1;
                        }
                        if(i == grid.length-1){
                            p+=1;
                        }
                    }
                } else if (i != 0 && j == 0 && i!=grid.length-1) {
                    if (grid[i][j] == 1) {
                        p += 1;
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 0) {
                            p += 1;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 0) {
                            p += 1;
                        }
                        if (i - 1 > -1 && grid[i - 1][j] == 0) {
                            p += 1;
                        }
                        if(j == grid[0].length-1){
                            p+=1;
                        }
                    }
                } else if (i != 0 && j == grid[0].length - 1 && i!=grid.length-1) {
                    if (grid[i][j] == 1) {
                        p += 1;
                        if (j - 1 > -1 && grid[i][j - 1] == 0) {
                            p += 1;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 0) {
                            p += 1;
                        }
                        if (i - 1 > -1 && grid[i - 1][j] == 0) {
                            p += 1;
                        }
                        if(j == 0){
                            p+=1;
                        }
                    }
                } else if (i == grid.length - 1 && j != 0 && j!=grid[0].length-1) {
                    if (grid[i][j] == 1) {
                        p += 1;
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 0) {
                            p += 1;
                        }
                        if (i - 1 > -1 && grid[i - 1][j] == 0) {
                            p += 1;
                        }
                        if (j - 1 > -1 && grid[i][j - 1] == 0) {
                            p += 1;
                        }
                        if(i == 0){
                            p+=1;
                        }
                    }
                } else if (i != 0 && j != 0 && i!=grid.length-1 && j!=grid[0].length-1) {
                    if (grid[i][j] == 1) {
                        if (i > 0 && grid[i - 1][j] == 0) {
                            p += 1;
                        }
                        if (i < grid.length - 1 && grid[i + 1][j] == 0) {
                            p += 1;
                        }
                        if (j > 0 && grid[i][j - 1] == 0) {
                            p += 1;
                        }
                        if (j < grid[0].length - 1 && grid[i][j + 1] == 0) {
                            p += 1;
                        }
                    }
                } else if (i == 0 && j == grid[0].length - 1) {
                    if (grid[i][j] == 1) {
                        p += 2;
                        if (j - 1 > -1 && grid[i][j - 1] == 0) {
                            p += 1;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 0) {
                            p += 1;
                        }
                        if(i == grid.length-1){
                            p+=1;
                        }
                        if(j == 0){
                            p+=1;
                        }
                    }
                } else if (i == grid.length - 1 && j == grid[0].length - 1) {
                    if (grid[i][j] == 1) {
                        p += 2;
                        if (j - 1 > -1 && grid[i][j - 1] == 0) {
                            p += 1;
                        }
                        if (i - 1 > -1 && grid[i - 1][j] == 0) {
                            p += 1;
                        }
                        if(i == 0){
                            p+=1;
                        }
                        if(j == 0){
                            p+=1;
                        }
                    }
                } else if (i == grid.length - 1 && j == 0) {
                    if (grid[i][j] == 1) {
                        p += 2;
                        if (j + 1 < grid[0].length && grid[i][j + 1] == 0) {
                            p += 1;
                        }
                        if (i - 1 > -1 && grid[i - 1][j] == 0) {
                            p += 1;
                        }
                        if(i == 0){
                            p+=1;
                        }
                        if(j == grid[0].length-1){
                            p+=1;
                        }
                    }
                }
            }
        }
        return p;
    }
}
