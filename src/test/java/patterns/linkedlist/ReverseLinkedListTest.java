package patterns.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseLinkedListTest {
    private final ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void reversesIteratively() {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        ListNode reversed = solution.reverseIterative(head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.toArray(reversed));
    }

    @Test
    void reversesRecursively() {
        ListNode head = ListNode.of(1, 2, 3);
        ListNode reversed = solution.reverseRecursive(head);
        assertArrayEquals(new int[]{3, 2, 1}, ListNode.toArray(reversed));
    }

    @Test
    void handlesSingleNode() {
        ListNode head = ListNode.of(1);
        assertArrayEquals(new int[]{1}, ListNode.toArray(solution.reverseIterative(head)));
    }
}
