/*
 * Problem - Longest Common Prefix (Leetcode #14)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/longest-common-prefix/
 *
 * Topics: String
 *
 * Approach:
 * - Assume the first string as the prefix.
 * - Compare this prefix with each subsequent string:
 *   - Reduce the prefix length until it matches the start of each string.
 * - If prefix becomes empty, return "".
 * - Otherwise, return the final prefix.
 *
 * Time Complexity: O(n * m) where n = number of strings, m = length of the shortest string
 * Space Complexity: O(1)
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(s));
    }
    static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}