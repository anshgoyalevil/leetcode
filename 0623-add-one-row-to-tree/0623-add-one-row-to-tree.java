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
    
    public void kd(TreeNode root, int k, int v){
        if(root == null || k<0){
            return;
        }
        if(k==0){
            TreeNode lst = root.left;
            TreeNode rst = root.right;
            TreeNode ln = new TreeNode(v);
            TreeNode rn = new TreeNode(v);
            ln.left = lst;
            rn.right = rst;
            root.left = ln;
            root.right = rn;
        }
        kd(root.left, k-1, v);
        kd(root.right, k-1, v);
    }
    
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        if(d==1){
            TreeNode r = new TreeNode(v);
            r.left = root;
            return r;
        }
        
        kd(root, d-2, v);
        
        return root;
        
    }
}