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
    
    int sum = 0;
    
    public void s(TreeNode root, int low, int high){
        if(root!=null){
            if(root.val <= high && root.val>=low){
                sum+=root.val;
            }
            s(root.left, low, high);
            s(root.right, low, high);
            
        }
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        s(root, low, high);
        return sum;
        
    }
}