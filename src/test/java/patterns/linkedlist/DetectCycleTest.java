package patterns.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectCycleTest {
    private final DetectCycle solution = new DetectCycle();

    @Test
    void detectsCycleWhenPresent() {
        ListNode head = ListNode.of(3, 2, 0, -4);
        ListNode tail = head.next.next.next; // node with value -4
        tail.next = head.next; // point back into the list, creating a cycle
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void returnsFalseForAcyclicList() {
        ListNode head = ListNode.of(1, 2, 3);
        assertFalse(solution.hasCycle(head));
    }

    @Test
    void returnsFalseForEmptyList() {
        assertFalse(solution.hasCycle(null));
    }
}
