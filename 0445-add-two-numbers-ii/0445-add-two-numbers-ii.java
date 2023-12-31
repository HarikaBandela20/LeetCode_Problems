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
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
    ListNode r2 = reverse(l2);
    int rem = 0;
    ListNode t1 = r1;
    ListNode t2 = r2;
    ListNode f = new ListNode(0);
    ListNode current = f;

    while (t1 != null || t2 != null || rem!=0) {
        int sum = (t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0) + rem;
        rem = sum / 10;
        int digit = sum % 10;
        current.next = new ListNode(digit);
        current = current.next;

        if (t1 != null)
            t1 = t1.next;
        if (t2 != null)
            t2 = t2.next;
    }
        return reverse(f.next);
    }
}