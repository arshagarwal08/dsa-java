/*
 * Problem - Union of Two Sorted Arrays
 * Difficulty - Easy
 * 
 * Description:
 * Given two sorted arrays, return their union as a sorted array with unique elements.
 * The result should maintain sorted order and remove duplicates.
 * 
 * Example:
 * Input: nums1 = [1, 2, 2, 3], nums2 = [2, 3, 4, 5]
 * Output: [1, 2, 3, 4, 5]
 * 
 * Approach:
 * - Use two pointers (i and j) to traverse both arrays.
 * - Compare elements from nums1 and nums2.
 * - Skip duplicate elements and add unique values to the result list.
 * - Convert the result list to an integer array and return.
 * 
 * Time Complexity: O(m + n) where m and n are the lengths of the two arrays
 * Space Complexity: O(m + n) for the result array
 */


import java.util.*;

public class UnionArrays {
    public static void main(String[] args) {
        int array1[] = {1,2,2,3}, array2[] = {2,3,4,5};

        int[] union = unionArray(array1,array2);

        System.out.print("After union: ");
        for(int i : union){
            System.out.print(i + " ");
        }
    }
    static int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (nums1[i] != last) {
                    ans.add(nums1[i]);
                    last = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                if (nums1[i] != last) {
                    ans.add(nums1[i]);
                    last = nums1[i];
                }
                i++;
            } else {
                if (nums2[j] != last) {
                    ans.add(nums2[j]);
                    last = nums2[j];
                }
                j++;
            }
        }

        while (i < nums1.length) {
            if (nums1[i] != last) {
                ans.add(nums1[i]);
                last = nums1[i];
            }
            i++;
        }

        while (j < nums2.length) {
            if (nums2[j] != last) {
                ans.add(nums2[j]);
                last = nums2[j];
            }
            j++;
        }

        int[] res = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            res[k] = ans.get(k);
        }

        return res;
    }

}
