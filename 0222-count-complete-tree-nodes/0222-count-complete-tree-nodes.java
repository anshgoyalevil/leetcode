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
    
    int ans = 0;
    
    public int h(TreeNode root){
        if(root == null){
            return -1;
        }
        return Math.max(h(root.left), h(root.right))+1;
    }
    
    public void kd(TreeNode root, int k){
        if(root==null || k<0){
            return;
        }
        if(k==0){
            ans++;
        }
        kd(root.left, k-1);
        kd(root.right, k-1);
    }
    
    public int countNodes(TreeNode root) {
        
        int h = h(root);
        
        int a = 1;
        
        for(int i = 0; i<h; i++){
            ans+=a;
            a=a*2;
        }
        
        kd(root, h);
        
        return ans;
        
    }
}