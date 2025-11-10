package exercises.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("InsertLast Strategy — recursive & iterative")
class InsertLastStrategyTest {

    private void runCommonCases(InsertLastStrategy s) {
        // empty list → creates head
        ListNode h1 = null;
        h1 = s.insertLast(h1, 7);
        assertNotNull(h1);
        assertEquals(7, h1.val);
        assertNull(h1.next);

        // single element
        ListNode h2 = LinkedListFixtures.fromArray(1);
        h2 = s.insertLast(h2, 2);
        assertArrayEquals(new int[]{1,2}, LinkedListFixtures.toArray(h2));

        // multiple elements
        ListNode h3 = LinkedListFixtures.fromArray(10, 20, 30);
        h3 = s.insertLast(h3, 40);
        assertArrayEquals(new int[]{10,20,30,40}, LinkedListFixtures.toArray(h3));
    }

    @Nested @DisplayName("Recursive")
    class Recursive {
        @Test void works() { runCommonCases(new RecursiveInsertLast()); }
    }

    @Nested @DisplayName("Iterative")
    class Iterative {
        @Test void works() { runCommonCases(new IterativeInsertLast()); }
    }
}

