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
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return head;
        }
        ListNode less_than_x = new ListNode(0); 
        ListNode more_than_x = new ListNode(0);
        ListNode less_head = less_than_x;
        ListNode more_head = more_than_x;

        while (head != null) {
            if (head.val < x) {
                less_than_x.next = head;
                less_than_x = less_than_x.next;
            } else {
                more_than_x.next = head;
                more_than_x = more_than_x.next;
            }
            head = head.next;
        }
        more_than_x.next = null; 
        less_than_x.next = more_head.next;
        return less_head.next; 
    }
}
