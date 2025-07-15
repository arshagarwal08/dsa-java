/*
 * Problem - Rotate String (Leetcode #796)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/rotate-string/
 *
 * Topics: String
 *
 * Approach:
 * - If lengths of A and B differ, return false immediately.
 * - Concatenate A with itself (A + A).
 * - If B is a substring of this concatenated string, A can be rotated to form B.
 * - Otherwise, return false.
 *
 * Time Complexity: O(n^2) in worst case due to substring search (where n is the length of A)
 * Space Complexity: O(n) for the concatenated string
 */

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal="cdeab";

        System.out.println(rotateString(s, goal));
    }
    static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    } 
}
