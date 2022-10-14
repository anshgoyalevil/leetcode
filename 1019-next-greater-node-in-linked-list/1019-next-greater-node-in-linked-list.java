class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int a[]=new int[size];
        int k=0;
        curr=head;
        while(curr!=null){
            a[k++]=curr.val;
            curr=curr.next;
        }
        int ans[]=new int[size];
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(a[j]>a[i]){
                    ans[i]=a[j];
                    break;
                }
            }
            ans[i]=ans[i]>0?ans[i]:0;
        }
        return ans;
    }
}