package exercises.linkedlist;

import java.util.ArrayList;
import java.util.List;

public final class LinkedListFixtures {
    private LinkedListFixtures() {}

    public static ListNode fromArray(int... vals) {
        ListNode head = null, tail = null;
        for (int v : vals) {
            ListNode n = new ListNode(v);
            if (head == null) { head = tail = n; } else { tail.next = n; tail = n; }
        }
        return head;
    }

    public static int[] toArray(ListNode head) {
        List<Integer> out = new ArrayList<>();
        for (ListNode p = head; p != null; p = p.next) out.add(p.val);
        return out.stream().mapToInt(i -> i).toArray();
    }

    public static int length(ListNode head) {
        int len = 0;
        for (ListNode p = head; p != null; p = p.next) len++;
        return len;
    }
}

