/*
 * Problem - Remove Nth Node From End of List (Leetcode #19)
 * Difficulty - Medium
 * Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * Topics: Linked List, Two Pointers
 *
 * Approach:
 * - Use two pointers (`first` and `second`).
 * - Move `first` ahead by `n+1` steps to maintain a gap.
 * - Move both together until `first` reaches the end.
 * - Now `second.next` is the node to be removed.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class RemoveNthNodeFromEndOfLL {
    static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0), first = dummy, second = dummy;

        dummy.next = head;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }
}
