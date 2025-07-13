/*
 * Problem - Length of Loop in Linked List
 * Difficulty - Easy
 * Custom Problem (Based on Floyd's Cycle Detection)
 *
 * Topics: Linked List, Two Pointers
 *
 * Description:
 * - Given the head of a singly linked list, detect if a cycle exists.
 * - If a cycle is present, return the length of the loop.
 * - If no cycle exists, return 0.
 *
 * Approach:
 * - Use Floyd's Cycle Detection (slow and fast pointers) to check for a cycle.
 * - If a cycle is detected (slow == fast), start counting the cycle length:
 *   - Fix one pointer.
 *   - Move the other pointer one step at a time until it meets the fixed pointer again.
 *   - Increment count on each step to determine the cycle length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class LengthOfLoopInLL {
    public int countCycleLength(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return calculateLength(slow);
            }
        }

        return 0;
    }

    private int calculateLength(ListNode node) {
        ListNode current = node;
        int length = 0;

        do {
            current = current.next;
            length++;
        } while (current != node);

        return length;
    }
}
