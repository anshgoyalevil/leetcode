class Solution {
    int ans = 0;
    int empty=1;

    public void sol(int[][] grid, int a, int b, int[][] vis, int c) {
        if (a < 0 || b < 0 || a >= grid.length || b >= grid[0].length || vis[a][b] == 5 || grid[a][b] == -1) {
            return;
        }
        if (grid[a][b] == 2) {
            if(c == empty){
                ans++;
            }
            return;
        }

        vis[a][b] = 5;
        sol(grid, a, b + 1, vis, c+1);
        sol(grid, a + 1, b, vis, c+1);
        sol(grid, a, b - 1, vis, c+1);
        sol(grid, a - 1, b, vis, c+1);
        vis[a][b] = 0;
    }

    public int uniquePathsIII(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];

        int a = 0;
        int b = 0;

        outer:for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    a = i;
                    b = j;
                }
                else if(grid[i][j] == 0){
                    empty++;
                }
            }
        }

        sol(grid, a, b, vis, 0);

        return ans;
    }
}
