/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        ListNode curr3 = headA;
        ListNode curr4 = headA;
        boolean find = false;
        
        ListNode ans = null;
        
        while(curr1 != null){
            curr1.val = curr1.val + 100000;
            curr1 = curr1.next;
        }
        
        while(curr2 != null){
            if(curr2.val > 100000 && find == false){
                curr2.val = curr2.val - 100000;
                ans = curr2;
                find = true;
            }
            if(curr2.val > 100000){
                curr2.val = curr2.val - 100000;
            }
            else{
                curr2 = curr2.next;
            }
            
        }
        
        while(curr3 != null){
            if(curr3.val > 100000){
                curr3.val = curr3.val - 100000;
            }
            curr3 = curr3.next;
        }
        
        return ans;
        
    }
}