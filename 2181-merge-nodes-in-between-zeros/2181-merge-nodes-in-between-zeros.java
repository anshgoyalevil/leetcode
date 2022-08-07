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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode curr = head;
        
        ListNode ans = new ListNode(-1);
        ListNode it = ans;
        
        int sumTillNow = 0;
        
        curr = curr.next;
        
        while(curr!=null){
            if(curr.val == 0){
                if(ans.val == -1){
                    ans.val = sumTillNow;
                    System.out.println(sumTillNow + " from if");
                    sumTillNow = 0;
                }
                else{
                    ListNode nx = new ListNode(sumTillNow);
                    System.out.println(sumTillNow + " from else");
                    sumTillNow = 0;
                    
                    it.next = nx;
                    it = it.next;
                }
            }
            else{
                sumTillNow+=curr.val;
            }
            curr = curr.next;
        }
        
        return ans;
        
    }
}