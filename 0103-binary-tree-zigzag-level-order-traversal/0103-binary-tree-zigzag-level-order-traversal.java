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
    
    List<Integer> m;
    
    public int h(TreeNode root){
        if(root==null){
            return -1;
        }
        return Math.max(h(root.left), h(root.right))+1;
    }
    
    public void ltr(TreeNode root, int k){
        if(root==null || k<0){
            return;
        }
        if(k==0){
            m.add(root.val);
        }
        ltr(root.left, k-1);
        ltr(root.right, k-1);
    }
    
    public void rtl(TreeNode root, int k){
        if(root==null || k<0){
            return;
        }
        if(k==0){
            m.add(root.val);
        }
        rtl(root.right, k-1);
        rtl(root.left, k-1);
    }
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        int h = h(root);
        
        for(int i = 0; i<=h; i++){
            m = new ArrayList<>();
            if(i%2==0){
                ltr(root, i);
                ans.add(m);
            }
            else{
                rtl(root, i);
                ans.add(m);
            }
        }
        return ans;
    }
}