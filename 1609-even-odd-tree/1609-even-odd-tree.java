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
    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        
        this.levelOrderTraversal(levels, root, 0);
        
        for (int lvl = 0; lvl < levels.size(); lvl++) {
            List<Integer> level = levels.get(lvl);
            
            for (Integer val: level) {
                if (val % 2 != 0) {
                    return false;
                }
            }
            
            for (int i = 0; i < level.size() - 1; i++) {
                if (level.get(i) >= level.get(i + 1)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private void levelOrderTraversal(List<List<Integer>> levels, TreeNode node, int level) {
        if (node == null)
            return;
        
        if (levels.size() <= level) {
            levels.add(new ArrayList<>());
        }
        
        if (level % 2 == 0) {
            levels.get(level).add(node.val + 1);
        } else {
            levels.get(level).add(0, node.val);
        }
        
        this.levelOrderTraversal(levels, node.left, level + 1);
        this.levelOrderTraversal(levels, node.right, level + 1);
    } 
}