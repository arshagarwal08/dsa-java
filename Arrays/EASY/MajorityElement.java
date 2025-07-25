/*
 * Problem - Majority Element (Leetcode #169)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/majority-element/
 *
 * Topics: Array, Hashing, Divide and Conquer, Boyer-Moore
 *
 * Approach:
 * - We maintain a candidate and a count.
 * - If count is 0, we set the current element as the new candidate.
 * - If the current element == candidate, increase count.
 * - Else, decrease count.
 * - Because the majority element appears more than n/2 times,
 *   it will always remain the final candidate.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MajorityElement {
    public static void main(String[] args) {
        int[] a = {3,3,2};
        System.out.println(majorityElement(a));
    }
    static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}


