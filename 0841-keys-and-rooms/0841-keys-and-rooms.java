class Solution {

    public void f(boolean[] r, int id, List<List<Integer>> rooms) {
        r[id] = true;

        for (int e : rooms.get(id)) {
            if (r[e] == false) {
                f(r, e, rooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] r = new boolean[rooms.size()];
        f(r, 0, rooms);
        for (boolean b : r) {
            if (!b) {
                return b;
            }
        }
        return true;
    }
}
