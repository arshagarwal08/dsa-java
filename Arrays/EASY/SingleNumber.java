/*
 * Problem - Single Number (Leetcode #136)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/single-number/
 *
 * Topics: Arrays, Bit Manipulation
 *
 * Approach:
 * - Use XOR (^) property:
 *   a ^ a = 0, and a ^ 0 = a
 * - XOR all elements together, the result will be the single number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single Number: " + singleNumber(nums));
    }
}
