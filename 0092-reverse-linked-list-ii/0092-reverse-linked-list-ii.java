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
    ArrayList<Integer> a=new ArrayList<Integer>();
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode h=head;
        int count=1;
        while(h!=null){
            if(count>=left && count<=right){
                a.add(h.val);
            }
            h=h.next;
            count++;
        }
        Collections.reverse(a);
        //System.out.println(a);
        ListNode x=new ListNode(0);
        ListNode res=x;
        int c=1;
        while(c<=count-1){
            if(c>=left && c<=right){
                for(int i=0;i<=(right-left);i++){
                    //System.out.println(a.get(i));
                    ListNode f=new ListNode(a.get(i));
                    x.next=f;
                    x=x.next;
                    c++;
                    if(head.next==null){
                        break;
                    }
                    head=head.next;
                }
            }else{
                x.next=head;
                x=x.next;
                c++;
                if(head.next==null){
                        break;
                }
                head=head.next;
            }
        }
        return res.next;
    }
}