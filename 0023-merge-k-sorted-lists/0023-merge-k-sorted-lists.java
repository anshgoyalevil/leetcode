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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i<lists.length; i++){
            ListNode curr = lists[i];
            while(curr!=null){
                arr.add(curr.val);
                curr=curr.next;
            }
        }
        
        if(arr.size() == 0){
            return null;
        }
        
        Collections.sort(arr);
        
        ListNode ans = new ListNode(arr.get(0));
        
        ListNode c = ans;
        
        for(int i = 1; i<arr.size(); i++){
            ListNode nx = new ListNode(arr.get(i));
            c.next = nx;
            c = c.next;
        }
        return ans;
    }
}