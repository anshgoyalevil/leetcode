class Solution {
    
    int binarySearch(int arr[][], int l, int r, int x, int i)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if (arr[i][mid] == x)
                return mid;
  
            if (arr[i][mid] > x)
                return binarySearch(arr, l, mid - 1, x, i);
  
            return binarySearch(arr, mid + 1, r, x, i);
        }
  
        return -1;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i<matrix.length; i++){
            if(target >= matrix[i][0] && target<=matrix[i][matrix[i].length-1]){
                if(binarySearch(matrix, 0, matrix[i].length-1, target, i) != -1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        
        return false;
        
    }
}