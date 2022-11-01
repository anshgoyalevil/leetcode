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

    public void f(TreeNode root, int target) {
        if (root == null) {
            return;
        }

        f(root.left, target);
        f(root.right, target);
        if (root.left != null && root.left.left == null && root.left.right == null && root.left.val == target) {
            root.left = null;
        }
        if (root.right != null && root.right.left == null && root.right.right == null && root.right.val == target) {
            root.right = null;
        }
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        f(root, target);
        if(root.left == null && root.right == null && root.val == target){
            return null;
        }
        return root;
    }
}
