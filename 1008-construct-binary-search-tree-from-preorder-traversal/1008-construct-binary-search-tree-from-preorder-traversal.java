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
    
    public TreeNode f(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = f(root.left, val);
        } else if (root.val < val) {
            root.right = f(root.right, val);
        }

        return root;
    }
    
    public TreeNode bstFromPreorder(int[] po) {
        
        TreeNode root = new TreeNode(po[0]);
        for(int i = 1; i<po.length; i++){
            root = f(root, po[i]);
        }
        
        return root;
        
    }
}