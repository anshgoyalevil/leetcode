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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode curr = list1;
        
        ListNode prev = null;
        
        ListNode nx = null;
        
        int n1 = 0;
        int n2 = 0;
        
        while(curr!=null){
            if(n1 == a){
                break;
            }
            else{
                n1++;
                n2++;
                prev = curr;
                curr = curr.next;
            }
        }
        
        while(curr!=null){
            if(n2 == b){
                nx = curr.next;
                break;
            }
            else{
                n2++;
                curr = curr.next;
            }
        }
        
        prev.next = list2;
        
        ListNode curr2 = list2;
        
        while(curr2.next!=null){
            curr2 = curr2.next;
        }
        
        curr2.next = nx;
        
        return list1;
        
    }
}