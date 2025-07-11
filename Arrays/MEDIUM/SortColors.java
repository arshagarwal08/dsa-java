/*
 * Problem - Sort Colors (Leetcode #75)
 * Difficulty - Medium
 * Link - https://leetcode.com/problems/sort-colors/
 *
 * Topics: Arrays, Two Pointers, Sorting
 *
 * Approach:
 * - Use three pointers: low, mid, and high
 * - Traverse and swap based on value at mid:
 *   - If 0 → swap with low, move both
 *   - If 1 → just move mid
 *   - If 2 → swap with high, move high
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SortColors {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
