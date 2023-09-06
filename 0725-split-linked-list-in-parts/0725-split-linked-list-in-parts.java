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
        // Check if head is null
        if (head == null) {
            ListNode[] emptyParts = new ListNode[k];
            return emptyParts; // Return an array of k empty lists
        }

        countelements(head);

        int capacity = count / k;
        int remainder = count % k;

        ListNode[] res = new ListNode[k];
        ListNode current = head; // A reference to the current head

        for (int i = 0; i < k; i++) {
            res[i] = current; // Store the current head of the part
            int partSize = capacity + (i < remainder ? 1 : 0); // Calculate the size of this part

            // Traverse the part and set the next part's head to null
            for (int j = 0; j < partSize - 1; j++) {
                current = current.next;
            }

            if (current != null) {
                ListNode nextHead = current.next;
                current.next = null; // Set the next pointer to null to end the current part
                current = nextHead; // Move to the next part's head
            }
        }

        return res;
    }
}
