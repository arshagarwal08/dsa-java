/*
 * Problem - Linked List Cycle II (Leetcode #142)
 * Difficulty - Medium
 * Link - https://leetcode.com/problems/linked-list-cycle-ii/
 *
 * Topics: Linked List, Two Pointers
 *
 * Approach:
 * - Use Floyd’s Cycle Detection Algorithm to detect the cycle.
 * - Once slow == fast, reset slow to head.
 * - Move slow and fast one step at a time; where they meet again is the start of the cycle.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}