package patterns.linkedlist;

// Problem: Linked List Cycle | Difficulty: Easy | Pattern: Floyd's Cycle Detection (fast/slow pointers) | Source: LeetCode #141 | Time: O(n) | Space: O(1)
public class DetectCycle {

    // Brute force: store visited nodes in a HashSet, check membership. Time: O(n), Space: O(n)
    // public boolean bruteForce(ListNode head) { ... }

    // Optimised: slow moves 1 step, fast moves 2 steps. They meet only if there's a cycle.
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
