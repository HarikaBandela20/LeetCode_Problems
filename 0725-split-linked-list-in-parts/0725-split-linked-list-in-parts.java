class Solution {
    int count = 0;

    public void countelements(ListNode h) {
        if (h != null) {
            count++;
        }
        if (h.next != null) {
            countelements(h.next);
        }
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        if (head == null) {
            ListNode[] emptyParts = new ListNode[k];
            return emptyParts;
        }
        countelements(head);

        int capacity = count / k;
        int remainder = count % k;

        ListNode[] res = new ListNode[k];
        ListNode current = head; 

        for (int i = 0; i < k; i++) {
            res[i] = current; 
            int partSize = capacity + (i < remainder ? 1 : 0); 
            for (int j = 0; j < partSize - 1; j++) {
                current = current.next;
            }

            if (current != null) {
                ListNode nextHead = current.next;
                current.next = null; 
                current = nextHead; 
            }
        }

        return res;
    }
}
