/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode curr = head;
        
        while(curr != null){
            
            if(curr.val == Integer.MIN_VALUE){
                return true;
            }
            else{
                curr.val = Integer.MIN_VALUE;
                curr = curr.next;
            }
            
        }
        
        return false;
        
    }
}