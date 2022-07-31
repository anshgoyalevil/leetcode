class Solution {
    
    public int binarySearch(int arr[], int l, int r)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            if ((mid!=0 && mid!=arr.length-1) && arr[mid]>arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else{
                if(mid==0){
                    return mid+1;
                }
                else if(mid == arr.length-1){
                    return mid-1;
                }
            }
  
            if ((mid!=0 && mid!=arr.length-1) && arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]){
                return binarySearch(arr, l, mid - 1);
            }
            else{
                if(mid==0){
                    return mid+1;
                }
                else if(mid == arr.length-1){
                    return mid-1;
                }
            }
  
            if ((mid!=0 && mid!=arr.length-1) && arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                return binarySearch(arr, mid + 1, r);
            }
            else{
                if(mid==0){
                    return mid+1;
                }
                else if(mid == arr.length-1){
                    return mid-1;
                }
            }
        }
  
        return -1;
    }
    
    public int peakIndexInMountainArray(int[] arr) {
        
        return binarySearch(arr, 0, arr.length-1);
        
    }
}