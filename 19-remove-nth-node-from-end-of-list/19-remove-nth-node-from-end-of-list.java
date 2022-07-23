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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;
        
        ListNode curr = head;
        
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        
        int rem = len - n;
        
        int i = 0;

        ListNode curr1 = head;

        if (rem == 0){
            head = head.next;
        }
        
        else{
        while (curr1 != null) {
            if (i == rem-1) {
                curr1.next = curr1.next.next;
                break;
            } else {
                i++;
                curr1 = curr1.next;
            }
        }
        }
        
        return head;
        
    }
}