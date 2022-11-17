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
    
    boolean flag = false;
    
    public void tr(TreeNode root){
        if(root!=null){
            tr(root.left);
            tr(root.right);
            if(root.val == 1){
                flag = true;
            }
        }
    }
    
    public void f(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            flag = false;
            tr(root.left);
            if(flag == false){
                root.left = null;
            }
        }
        if(root.right!=null){
            flag = false;
            tr(root.right);
            if(flag == false){
                root.right = null;
            }
        }
        f(root.left);
        f(root.right);
    }
    
    public TreeNode pruneTree(TreeNode root) {
        
        f(root);
        
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        
        return root;
        
    }
}