/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int r = 0;
    
    int ans = -1;
    
    public void f(TreeNode root, int k){
        if(root!=null){
            f(root.left, k);
            r++;
            if(r==k){
                ans=root.val;
            }
            f(root.right, k);
            if(ans!=-1){
                return;
            }
        }
    }
    
    public int kthSmallest(TreeNode root, int k) {
        
        f(root, k);
        return ans;
        
    }
}