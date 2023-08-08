class Solution {
    int count=0;
    public ListNode reverse(ListNode l){
        ListNode curr;
        ListNode prev=null;
        ListNode temp=null;
        curr=l;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            count++;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode t = new ListNode(0);
        ListNode current = t;
        ListNode originalCurrent = head;
        while (originalCurrent != null) {
            ListNode newNode = new ListNode(originalCurrent.val);
            current.next = newNode;
            current = newNode;
            originalCurrent = originalCurrent.next;
        }
        ListNode r1=t.next;
        ListNode r2=reverse(head);
        int count1=0;
        int max=0;
        while(r1!=null && r2!=null && count1<((count)/2)){
            int sum = r1.val + r2.val;
            max=Math.max(max,sum);
            r1=r1.next;
            r2=r2.next;
            count1++;
        }
        return max;
    }
}