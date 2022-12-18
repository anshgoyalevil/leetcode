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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(k==1){
            return head;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        
        int r = (arr.size()/k)*k;
        
        int s = k-2;
        int m = 1;
        
        ListNode h = new ListNode(arr.get(k-1));
        ListNode hd = h;
        
        while(s!=r-k){
            
            //System.out.println(s);
            ListNode nx = new ListNode(arr.get(s));
            h.next = nx;
            h = h.next;
            
            if(s%k==0){
                //System.out.println("here");
                m+=1;
                s+=(k*2)-1;
                continue;
            }
            s--;
        }
        
        ListNode nt = new ListNode(arr.get(s));
            h.next = nt;
            h = h.next;
        
        for(int i = r; i<arr.size(); i++){
            ListNode nx = new ListNode(arr.get(i));
            h.next = nx;
            h = h.next;
        }
        
        return hd;
        
    }
}