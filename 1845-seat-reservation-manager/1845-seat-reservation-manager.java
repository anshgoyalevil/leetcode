class SeatManager {
    
    TreeSet<Integer> ts = new TreeSet<>();

    public SeatManager(int n) {
        
        for(int i = 1; i<=n; i++){
            ts.add(i);
        }
        
    }
    
    public int reserve() {
        int a = ts.ceiling(0);
        ts.remove(a);
        return a;
    }
    
    public void unreserve(int seatNumber) {
        
        ts.add(seatNumber);
        
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */