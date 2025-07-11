/*
 * Problem - Move Zeroes (Leetcode #283)
 * Difficulty - Easy
 * Link: https://leetcode.com/problems/move-zeroes/
 * Topic - Arrays, Two Pointers
 * 
 * Approach -
 * 1. Use two pointers: one (`j`) to track the position for placing non-zero elements.
 * 2. Traverse array with index `i`.
 * 3. If nums[i] != 0, assign it to nums[j] and increment j.
 * 4. After all non-zero elements are placed, fill remaining positions with 0.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};

        moveZeroes(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    static void moveZeroes(int[] a) {
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j] = a[i];
                a[i] = 0;
                j++;
            }
        }
    }
}

