/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    
    public int bin(int l, int r){
        
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            if (isBadVersion(mid) == true && mid>0 && isBadVersion(mid-1) == false)
                return mid;
 
            if (isBadVersion(mid) == true && mid>0 && isBadVersion(mid-1) == true){
                return bin(l, mid - 1);
            }
                
 
            return bin(mid + 1, r);
        }
 
        return -1;
        
    }
    
    public int firstBadVersion(int n) {
        
        return bin(0, n);
        
    }
}