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

    public ListNode deleteMiddle(ListNode head) {
        int sz = 0;

        ListNode szn = head;

        while (szn != null) {
            sz++;
            szn = szn.next;
        }

        int index = (sz + 1) / 2;
        
        if(sz==1){
            return null;
        }

        ListNode ans = head;

        if (sz % 2 == 0) {
            int i = 0;

            if (index == 0) {
                return head.next;
            }

            while (head != null) {
                if (i == index - 1) {
                    head.next = head.next.next;
                    return ans;
                }
                head = head.next;
                i++;
            }
        } else {
            int i = 0;

            if (index == 0) {
                return head.next;
            }

            while (head != null) {
                i++;
                if (i == index - 1) {
                    head.next = head.next.next;
                    return ans;
                }
                head = head.next;
            }
        }

        return ans;
    }
}
