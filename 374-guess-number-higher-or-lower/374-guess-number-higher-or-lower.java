/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    
    public int find(int n, int l, int r){
        
        if(l > r){
            return -1;
        }
        
        int mid = l + (r-l)/2;
        
        if(guess(mid) == 0){
            return mid;
        }
        else if(guess(mid) == -1){
            r = mid-1;
            return find(n, l, r);
        }
        else{
            l = mid+1;
            return find(n, l, r);
        }
                
    }
    
    public int guessNumber(int n) {
        
        if(guess(n) == 0){
            return n;
        }
        
        return find(n, 0, n+1);
        
    }
}