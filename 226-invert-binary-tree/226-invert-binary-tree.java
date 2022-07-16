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
    
    public void invTree(TreeNode root){
        
        if(root!=null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invTree(root.left);
            invTree(root.right);
        }
    }
    
    public TreeNode invertTree(TreeNode root) {
        
        invTree(root);
        return root;
        
    }
}