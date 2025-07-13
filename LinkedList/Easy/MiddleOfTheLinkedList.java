/*
 * Problem - Middle of the Linked List (Leetcode #876)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/middle-of-the-linked-list/
 *
 * Topics: Linked List, Two Pointers
 *
 * Approach:
 * - Use two pointers: slow and fast.
 * - Move slow by one step and fast by two steps.
 * - When fast reaches the end, slow will be at the middle.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
