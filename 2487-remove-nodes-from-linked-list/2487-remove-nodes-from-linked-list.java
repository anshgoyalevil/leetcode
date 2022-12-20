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
    
    int mx = -1;
    
    public void rev(ListNode head){
        if(head == null){
            return;
        }
        rev(head.next);
        mx = Math.max(mx, head.val);
        if(head.val<mx){
            head.val = -1;
        }
    }
    
    public ListNode removeNodes(ListNode head) {
        rev(head);
        ListNode nh = new ListNode(0);
        ListNode it = nh;
        while(head!=null){
            if(head.val!=-1){
                ListNode nn = new ListNode(head.val);
                it.next = nn;
                it = it.next;
            }
            head = head.next;
        }
        return nh.next;
    }
}