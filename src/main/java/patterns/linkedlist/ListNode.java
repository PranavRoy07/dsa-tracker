package patterns.linkedlist;

// Shared singly-linked-list node used across the linkedlist package.
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // Convenience: build a list from an int array, e.g. ListNode.of(1, 2, 3)
    public static ListNode of(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    // Convenience: read a list back out into an array for assertions in tests.
    public static int[] toArray(ListNode head) {
        java.util.List<Integer> values = new java.util.ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}
