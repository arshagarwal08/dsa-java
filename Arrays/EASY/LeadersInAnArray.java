/*
 * Problem - Leaders in an Array
 *
 * Problem Description: You are given an array arr[] of positive integers. Find all the leaders in the array.
 * A leader is an element greater than or equal to all elements to its right. The rightmost element is always a leader.
 * 
 * Approach:
 * - Traverse from right to left.
 * - Track the max element seen so far.
 * - If current element >= maxSoFar, it's a leader.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) (excluding result list)
 */

import java.util.*;

public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length-1;
        int max = arr[n];
        ans.add(max);

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max= arr[i];
                ans.add(max);
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}


