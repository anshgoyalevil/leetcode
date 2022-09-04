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
    
    List<String> l = new ArrayList<>();
    
    public void f(TreeNode root, String psf){
        
        if(root.left == null && root.right == null){
            l.add(psf+root.val);
            return;
        }
        
        if(root.left!=null){
        f(root.left, psf+root.val+"->");
        }
        if(root.right!=null){
        f(root.right, psf+root.val+"->");
        }
        
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        f(root, "");
        return l;
    }
}