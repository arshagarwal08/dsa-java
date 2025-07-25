/*
 * Problem - Two Sum (Leetcode #1)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/two-sum/
 *
 * Topics: Array, HashMap
 *
 * Approach:
 * - Use a HashMap to store (target - nums[i]) as key and index as value.
 * - For each element, check if it exists in the map.
 * - If yes, return the pair of indices.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            map.put(target - nums[i], i);
        }
        
        return new int[] { -1, -1 };
    }
}


