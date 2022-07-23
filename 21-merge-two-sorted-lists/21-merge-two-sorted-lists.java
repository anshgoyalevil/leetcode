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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode ans = new ListNode(200);
        ListNode it = ans;
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        
        while(curr1!=null && curr2!=null){
            if(curr1.val <= curr2.val){
                ListNode add = new ListNode(curr1.val);
                if(it != null && it.val == 200){
                    it.val = curr1.val;
                    
                }
                else{
                        it.next = new ListNode(curr1.val);
                    it = it.next;
                    
                }
                curr1 = curr1.next;
            }
            else if(curr1.val >= curr2.val){
                ListNode add = new ListNode(curr2.val);
                if(it != null && it.val == 200){
                    it.val = curr2.val;
                }
                else{
                    it.next = new ListNode(curr2.val);
                    it = it.next;

                }
                curr2 = curr2.next;
            }
        
        }
        
        while(curr1!=null){
            it.next = curr1;
            curr1 = curr1.next;
            it = it.next;
        }
        while(curr2!=null){
            it.next = curr2;
            curr2 = curr2.next;
            it = it.next;
        }
        
        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }
        
        return ans;
        
    }
}