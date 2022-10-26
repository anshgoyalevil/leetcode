/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public int h(Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(h(root.left), h(root.right)) + 1;
    }

    Stack<Node> st = new Stack<>();

    public void kd(Node root, int k) {
        if (root == null || k < 0) {
            return;
        }
        if (k == 0) {
            st.add(root);
        }
        kd(root.left, k - 1);
        kd(root.right, k - 1);
    }

    public Node connect(Node root) {
        int height = h(root);
        Node prev = null;
        for(int i = 0; i<=height; i++){
            kd(root, i);
            while(st.size()>0){
                Node up = st.peek();
                st.pop();
                up.next = prev;
                prev = up;
            }
            prev=null;
        }
        return root;
    }
}
