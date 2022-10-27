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
    
    ArrayList<Integer> arr;
    
    public int h(TreeNode root){
        if(root == null){
            return -1;
        }
        return Math.max(h(root.left), h(root.right))+1;
    }
    
    int it = 0;
    
    public void f(TreeNode root, int k){
        
        if(root==null || k<0){
            return;
        }
        if(k==0){
            arr.add(root.val);
        }
        f(root.left, k-1);
        f(root.right, k-1);
        
    }
    
    public void rv(TreeNode root, int k){
        
        if(root==null || k<0){
            return;
        }
        if(k==0){
            root.val = arr.get(it);
            it++;
        }
        rv(root.right, k-1);
        rv(root.left, k-1);
        
    }

    public TreeNode reverseOddLevels(TreeNode root) {
        
        int h = h(root);
        
        for(int i = 1; i<=h; i+=2){
            it = 0;
            arr = new ArrayList<>();
            f(root, i);
            rv(root, i);
        }
        
        return root;
        
    }
    
}
