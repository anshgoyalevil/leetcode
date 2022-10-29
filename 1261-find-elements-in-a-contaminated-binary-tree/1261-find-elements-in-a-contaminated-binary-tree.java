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
class FindElements {
    
    HashSet<Integer> hs;
    
    public void f(TreeNode root){
        if(root!=null){
            if(root.left!=null){
                hs.add(root.val);
                hs.add((2*root.val) + 1);
                root.left.val = ((2*root.val) + 1);
            }
            if(root.right!=null){
                hs.add(root.val);
                hs.add((2*root.val)+2);
                root.right.val = (2*(root.val) + 2);
            }
            if(root.left==null){
                hs.add((root.val));
            }
            if(root.right==null){
                hs.add((root.val));
            }
            f(root.left);
            f(root.right);
        }
    }

    public FindElements(TreeNode root) {
        
        hs = new HashSet<>();
        hs.add(0);
        root.val = 0;
        f(root);
        
    }
    
    public boolean find(int target) {
        return hs.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */