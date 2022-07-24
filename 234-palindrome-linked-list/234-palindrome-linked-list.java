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
    public boolean isPalindrome(ListNode head) {
        
        int size = 0;
        
        ListNode curr1 = head;
        
        ListNode curr3 = head;
        
        while(curr1!=null){
            size++;
            curr1 = curr1.next;
        }
        
        int ind = 0;
        
        ListNode prev = null;
        ListNode curr2 = head;
        
        while(ind != (size+1)/2){
            ind++;
            curr2 = curr2.next;
        }
        
        while(curr2 != null){
            
            ListNode next = curr2.next;
            
            curr2.next = prev;
            
            prev = curr2;
            
            curr2 = next;
            
        }
        
        while(curr3!=null && prev!= null){
            if(curr3.val != prev.val){
                return false;
            }
            else{
                curr3 = curr3.next;
                prev = prev.next;
            }
        }
        
        return true;
        
    }
}