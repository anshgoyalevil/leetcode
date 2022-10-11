/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    
    List<Integer> ans = new ArrayList<>();
    
    public void f(Node root){
        
        ans.add(root.val);
        
        for(Node nd: root.children){
            f(nd);
        }
        
    }
    
    public List<Integer> preorder(Node root) {
        
        if(root == null){
            return ans;
        }
        
        f(root);
        return ans;
        
    }
}