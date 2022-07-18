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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null)return head;
        
        int val = head.val;
        ListNode ans = new ListNode(head.val);
        ListNode a = ans;
        
        while(head!=null){
            
            if(head.val != val){
                val = head.val;
                ListNode l = new ListNode(val);
                ans.next = l;
                ans = ans.next;
            }
            
            head = head.next;
            
        }
        
        return a;
        
    }
}