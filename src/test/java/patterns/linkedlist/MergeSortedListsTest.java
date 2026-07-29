package patterns.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedListsTest {
    private final MergeSortedLists solution = new MergeSortedLists();

    @Test
    void mergesTwoInterleavedLists() {
        ListNode l1 = ListNode.of(1, 2, 4);
        ListNode l2 = ListNode.of(1, 3, 4);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNode.toArray(solution.mergeTwoLists(l1, l2)));
    }

    @Test
    void handlesOneEmptyList() {
        ListNode l2 = ListNode.of(0);
        assertArrayEquals(new int[]{0}, ListNode.toArray(solution.mergeTwoLists(null, l2)));
    }
}
