/*
 * Problem - Linked List Cycle (Leetcode #141)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/linked-list-cycle/
 *
 * Topics: Linked List, Two Pointers
 *
 * Approach:
 * - Use Floyd’s Cycle Detection Algorithm (Tortoise and Hare).
 * - Move slow pointer by 1 and fast pointer by 2.
 * - If fast and slow meet, there is a cycle.
 * - If fast reaches null, there is no cycle.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class LinkedListCycle {
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

