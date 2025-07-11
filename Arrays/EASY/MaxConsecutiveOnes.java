/*
 * Problem - Max Consecutive Ones (Leetcode #485)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/max-consecutive-ones
 *
 * Topics: Arrays, Sliding Window
 *
 * Approach:
 * - Use a counter to track the current streak of 1s.
 * - When a 0 is encountered, compare and update the max result.
 * - Return the maximum found after scanning the array.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        return Math.max(ans, count);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums));
    }
}
