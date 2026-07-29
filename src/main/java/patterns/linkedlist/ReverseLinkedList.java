package patterns.linkedlist;

// Problem: Reverse Linked List | Difficulty: Easy | Pattern: Pointer Manipulation | Source: LeetCode #206 | Time: O(n) | Space: O(1) iterative / O(n) recursive
public class ReverseLinkedList {

    // Brute force: copy values into a list, reverse the list, rebuild. Time: O(n), Space: O(n)
    // public ListNode bruteForce(ListNode head) { ... }

    // Optimised iterative: rewire next pointers as we walk, no extra space.
    public ListNode reverseIterative(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // Optimised recursive: reverse the tail first, then point it back at head.
    public ListNode reverseRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
