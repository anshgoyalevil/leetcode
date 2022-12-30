class Solution {
    List<List<Integer>> lt;

    public List<List<Integer>> levelOrder(Node root) {
        lt = new ArrayList();
        if (root == null) return lt;
        dfs(root, 0);
        return lt;
    }

    private void dfs(Node nd, int h) {
        if (lt.size() - 1 < h) {
            lt.add(new ArrayList());
        }
        lt.get(h).add(nd.val);
        for (int i = 0; i < nd.children.size(); i++) {
            dfs(nd.children.get(i), h + 1);
        }
    }
}
