package patterns.linkedlist;

// Problem: Merge Two Sorted Lists | Difficulty: Easy | Pattern: Two Pointer / Dummy Node | Source: LeetCode #21 | Time: O(n + m) | Space: O(1)
public class MergeSortedLists {

    // Brute force: dump both lists into an array, sort, rebuild. Time: O((n+m)log(n+m)), Space: O(n+m)
    // public ListNode bruteForce(ListNode l1, ListNode l2) { ... }

    // Optimised: dummy head, splice nodes in sorted order without extra allocation.
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}
