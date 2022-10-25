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
class BSTIterator {
    
    ArrayList<Integer> arr = new ArrayList<>();
    int i = 0;
    
    public void io(TreeNode root){
        if(root!=null){
            io(root.left);
            arr.add(root.val);
            io(root.right);
        }
    }

    public BSTIterator(TreeNode root) {
        
        io(root);
        
    }
    
    public int next() {
        i++;
        return arr.get(i-1);
        
    }
    
    public boolean hasNext() {
        if(i<arr.size()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */