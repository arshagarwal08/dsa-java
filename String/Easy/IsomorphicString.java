/*
 * Problem - Isomorphic Strings (Leetcode #205)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/isomorphic-strings/
 *
 * Topics: Hash Table, String
 *
 * Approach:
 * - Use two integer arrays of fixed size (200) to represent character mappings for both strings.
 * - Iterate through both strings simultaneously.
 * - For each character pair, check if their last seen positions match.
 * - If not, the strings are not isomorphic — return false.
 * - Otherwise, update the last seen positions (using index + 1 to avoid the default zero).
 *
 * Time Complexity: O(n) where n is the length of the strings
 * Space Complexity: O(1) (constant space due to fixed-size arrays)
 */

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[200];
        int[] mapT = new int[200];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            if (mapS[cs] != mapT[ct]) return false;
            
            mapS[cs] = i + 1;
            mapT[ct] = i + 1;
        }
        return true;
    }
}
