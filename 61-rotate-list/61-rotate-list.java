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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k == 0){
            return head;
        }
        
        int len = 0;
        ListNode lenN = head;
        
        while(lenN!=null){
            len++;
            lenN = lenN.next;
        }
        
        if(k%len == 0){
            return head;
        }
        else{
            
            
            int rot = k%len;
            rot = len - rot - 1;
            
            int ind = 0;
            
            ListNode newHead = null;
            ListNode curr = head;
            
            while(curr.next!=null){
                if(ind == rot){
                    newHead = curr.next;
                    curr.val = curr.val + 500;
                }
                ind++;
                curr = curr.next;
            }
            
            ListNode n1 = newHead;
            
            while(n1.next!=null){
                n1 = n1.next;
            }
            
            
            
            n1.next = head;
            
            ListNode nuller = newHead;
            
            
            while(nuller!=null){
                if(nuller.val > 100){
                    nuller.val = nuller.val - 500;
                    nuller.next = null;
                    break;
                }
                nuller = nuller.next;
            }
            
            
            return newHead;
            
        }
        
    }
}