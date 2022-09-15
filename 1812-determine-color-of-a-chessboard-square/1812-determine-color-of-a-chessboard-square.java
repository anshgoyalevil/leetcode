class Solution {

    public boolean squareIsWhite(String c) {
        int x = (int) c.charAt(0) - 96;
        int y = (int) c.charAt(1) - (int) '0';

        if (x % 2 != 0 && y % 2 == 0) {
            return true;
        }
        if (x % 2 == 0 && y % 2 != 0) {
            return true;
        }
        return false;
    }
}
