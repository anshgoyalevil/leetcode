class Solution {
    public int equalPairs(int[][] grid) {
        
        if(grid.length != grid[0].length){
            return 0;
        }
        
        ArrayList<int[]> arr1 = new ArrayList<>();
        ArrayList<int[]> arr2 = new ArrayList<>();
        
        for(int i = 0; i<grid.length; i++){
            int [] a = new int [grid[0].length];
            for(int j = 0; j<grid[0].length; j++){
                a[j] = grid[i][j];
            }
            arr1.add(a);
        }
        
        for(int i = 0; i<grid[0].length; i++){
            int [] a = new int [grid.length];
            for(int j = 0; j<grid.length; j++){
                a[j] = grid[j][i];
            }
            arr2.add(a);
        }
        
        int ans = 0;
        
        for(int i = 0; i<arr1.size(); i++){
            for(int j = 0; j<arr2.size(); j++){
                if(Arrays.equals(arr1.get(i), arr2.get(j))){
                    ans++;
                }
            }
        }
        return ans;
    }
}