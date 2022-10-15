/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode it = head;
        int[][] matrix = new int[m][n];
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int right = c - 1;
        int bottom = r - 1;
        int left = 0;

        List<Integer> ans = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                if (it != null) {
                    matrix[top][i] = it.val;
                    it = it.next;
                } else {
                    matrix[top][i] = -1;
                }
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                if (it != null) {
                    matrix[i][right] = it.val;
                    it = it.next;
                } else {
                    matrix[i][right] = -1;
                }
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (it != null) {
                        matrix[bottom][i] = it.val;
                        it = it.next;
                    } else {
                        matrix[bottom][i] = -1;
                    }
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (it != null) {
                        matrix[i][left] = it.val;
                        it = it.next;
                    } else {
                        matrix[i][left] = -1;
                    }
                }
                left++;
            }
        }
        return matrix;
    }
}
