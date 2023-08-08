class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=new ListNode(0);
        ListNode temp1=new ListNode(0);
        ListNode first=temp;
        ListNode first1=temp1;
        int count=0;
        while(head!=null){
            if(count%2==0){
                temp.next=head;
                temp=temp.next;
            }else{
                temp1.next=head;
                temp1=temp1.next;
            }
            head=head.next;
            count++;
        }
        temp.next=first1.next;
        temp1.next=null;
        return first.next;
    }
}