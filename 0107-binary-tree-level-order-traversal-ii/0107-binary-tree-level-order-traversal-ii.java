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
    
    List<List<Integer>> ans = new ArrayList<>();
    
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int a = height(root.left);
        int b = height(root.right);
        
        return Math.max(a, b)+1;
        
    }
    
    List<Integer> m = new ArrayList<>();
    
    public void kd(TreeNode root, int l){
        
        if(root == null || l<0){
            return;
        }
        
        if(l==0){
            m.add(root.val);
        }
        
        kd(root.left, l-1);
        kd(root.right, l-1);
        
    }
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        int h = height(root);
        
        for(int i = h-1; i>=0; i--){
            kd(root, i);
            ans.add(m);
            m = new ArrayList<>();
        }
        return ans;
    }
}