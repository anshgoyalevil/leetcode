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
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        ListNode curr = head;

        while (curr != null) {
            hm.put(curr.val, hm.getOrDefault(curr.val, 0)+1);
            curr = curr.next;
        }

        ListNode l = new ListNode(101);
        ListNode ans = l;

        ListNode it = head;

        while (it != null) {
            if (l.val == 101) {
                if (hm.get(it.val) == 1) {
                    l.val = it.val;
                }
            } else {
                if (hm.get(it.val) == 1) {
                    ListNode nx = new ListNode(it.val);
                    l.next = nx;
                    l = l.next;
                }
            }
            it = it.next;
        }
        if(ans.val==101){
            return null;
        }
        else{
            return ans;
        }
    }
}
