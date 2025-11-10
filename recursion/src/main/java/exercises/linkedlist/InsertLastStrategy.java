package exercises.linkedlist;



public interface InsertLastStrategy {
    /**
     * Insert a node with the given value at the end of the list.
     * @param head current head (may be null)
     * @param value value to insert
     * @return head of the list (may be a new node if head was null)
     */
    ListNode insertLast(ListNode head, int value);
}

