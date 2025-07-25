/*
 * Problem - Odd Even Linked List (Leetcode #328)
 * Difficulty - Medium
 * Link - https://leetcode.com/problems/odd-even-linked-list/
 *
 * Topics: Linked List
 *
 * Approach:
 * - Use two pointers: `odd` and `even`.
 * - Link all odd nodes followed by even nodes.
 * - Rearrange nodes in a single pass with O(1) space.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class OddEvenLinkedList {
    static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head, even = head.next, evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}

