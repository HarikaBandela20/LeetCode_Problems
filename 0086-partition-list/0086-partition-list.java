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
    List<Integer> l1=new ArrayList<Integer>();
    List<Integer> l2=new ArrayList<Integer>();
    public void addnodesvalues(ListNode head, int x1){
        if(head==null){
            return;
        }
        if(head.val<x1){
            l1.add(head.val);
        }else{
            l2.add(head.val);
        }
        addnodesvalues(head.next,x1);
    }
    public ListNode addnodes(List<Integer> l){
        ListNode head1=new ListNode(l.get(0));
        ListNode temp=head1;
        for(int i=1;i<l.size();i++){
            ListNode temp1=new ListNode(l.get(i));
            temp.next=temp1;
            temp=temp1;
        }
        return head1;
    }
    public ListNode partition(ListNode head, int x) {
        addnodesvalues(head,x);
        l1.addAll(l2);
        if(l1.size()==0){
            return head;
        }
        return addnodes(l1);
    }
}