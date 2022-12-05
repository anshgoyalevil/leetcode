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
    List<TreeNode> ls = new ArrayList<>();
    
    public void f(TreeNode root, int t){
        if(root!=null){
            if(root.val==t){
                root.val = -1;
            }
            f(root.left, t);
            f(root.right, t);
        }
    }
    
    public void del(TreeNode root){
        if(root == null){
            return;
        }
        del(root.left);
        del(root.right);
        // if(root.left!=null && root.val == -1){
        //     ls.add(root.left);
        //     if(root.right!=null){
        //         ls.add(root.right);
        //     }
        //     root = null;
        // }
        // else if(root.right!=null && root.val == -1){
        //     ls.add(root.right);
        //     if(root.left!=null){
        //         ls.add(root.left);
        //     }
        //     root = null;
        // }
        
        if(root.left != null && root.left.val == -1){
            if(root.left.right != null){
                ls.add(root.left.right);
            }
            if(root.left.left != null){
                ls.add(root.left.left);
            }
            root.left = null;
        }
        if(root.right!= null && root.right.val == -1){
            if(root.right.right != null){
                ls.add(root.right.right);
            }
            if(root.right.left != null){
                ls.add(root.right.left);
            }
            root.right = null;
        }
        
    }
    
    public List<TreeNode> delNodes(TreeNode root, int[] td) {
        
        for(int i = 0; i<td.length; i++){
            f(root, td[i]);
        }
        
        del(root);
        if(root.val != -1){
            ls.add(root);
        }
        else{
            if(root.right!=null){
                ls.add(root.right);
            }
            if(root.left!=null){
                ls.add(root.left);
            }
        }
        
        return ls;
        
    }
}