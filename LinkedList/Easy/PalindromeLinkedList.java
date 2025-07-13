/*
 * Problem - Palindrome Linked List (Leetcode #234)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/palindrome-linked-list/
 *
 * Topics: Linked List, Two Pointers, Stack
 *
 * Approach:
 * - Find the middle of the linked list using slow and fast pointers.
 * - Reverse the second half of the list.
 * - Compare the first half and the reversed second half node by node.
 * - If all corresponding nodes match, the list is a palindrome.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverse(slow);

        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
