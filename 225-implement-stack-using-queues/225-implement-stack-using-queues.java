class MyStack {
    
    Queue<Integer> q;
    int size = 0;
    int ind = -1;
    int top = -1;

    public MyStack() {
        
        q = new LinkedList<>();
        
    }
    
    public void push(int x) {
        
        q.add(x);
        size++;
        ind++;
        top = x;
        
    }
    
    public int pop() {
        
        int up = -1;
        
        for(int i = 0; i<size-1; i++){
            up = q.poll();
            q.add(up);
            top = up;
        }
        size--;
        int ans = q.poll();
        return ans;
        
    }
    
    public int top() {
        
        return top;
        
    }
    
    public boolean empty() {
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */