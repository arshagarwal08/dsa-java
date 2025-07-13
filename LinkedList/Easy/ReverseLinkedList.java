/*
 * Problem - Reverse Linked List (Leetcode #206)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/reverse-linked-list/
 *
 * Topics: Linked List, Recursion, Iterative
 *
 * Approach:
 * - Use three pointers: prev, cur, and next.
 * - Iterate through the list, reversing the next pointer of each node.
 * - Return the prev pointer as the new head.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import LinkedList.ListNode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = null,cur=head;

        while(cur!=null){
            ListNode nex = cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }

        return prev;
    }
}
