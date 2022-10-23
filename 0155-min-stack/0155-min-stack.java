class MinStack {
    private Stack<int[]> st = null;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (!st.isEmpty()) {
            int top[] = st.peek();
            int min = Math.min(top[1], val);
            st.push(new int[] { val, min });
        } else {
            st.push(new int[] { val, val });
        }
    }

    public void pop() {
        if (!st.isEmpty()) {}
        st.pop();
    }

    public int top() {
        int[] top = st.peek();
        return top[0];
    }

    public int getMin() {
        int top[] = st.peek();
        return top[1];
    }
}
