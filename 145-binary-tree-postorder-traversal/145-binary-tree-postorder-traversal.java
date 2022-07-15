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
    
    List<Integer> ls = new ArrayList<Integer>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            ls.add(root.val);
        }
        
        return ls;
        
    }
}