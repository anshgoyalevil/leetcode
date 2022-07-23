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
    public ListNode middleNode(ListNode head) {
        
        int size = 0;
        
        ListNode curr = head;
        
        ListNode mid = head;
        
        int t = 1;
        
        while(curr != null){
            size++;
            curr = curr.next;
        }
        
        int ind = 0;
        if(size%2 == 0){
            ind = (size+2)/2;
        }
        else{
            ind = (size+1)/2;
        }
        
        while(mid != null){
            if(t == ind){
                return mid;
            }
            else{
                t++;
                mid = mid.next;
            }
        }
        return mid;
    }
}