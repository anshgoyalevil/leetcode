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
    
    public int fh(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(fh(root.left), fh(root.right))+1;
    }
    
    public void util(TreeNode root, int h){
        if(root==null){
            return;
        }
        if(h == 1){
            sum+=root.val;
        }
        if(root.left!=null){
            util(root.left, h-1);
        }
        if(root.right!=null){
            util(root.right, h-1);
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        
        int h = fh(root);
        util(root, h);
        return sum;
        
    }
}
