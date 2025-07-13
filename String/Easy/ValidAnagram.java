/*
 * Problem - Valid Anagram (Leetcode #242)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/valid-anagram/
 *
 * Topics: Hash Table, String, Sorting
 *
 * Approach:
 * - If lengths differ, return false immediately.
 * - Create two frequency count arrays of size 26 for each string.
 * - Count occurrences of each character in both strings.
 * - Compare frequency arrays; if any mismatch, return false.
 * - If all match, return true.
 *
 * Time Complexity: O(n), where n is the length of the strings
 * Space Complexity: O(1), since frequency arrays are fixed size (26)
 */

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t="nagamar";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) countS[c - 'a']++;
        for (char c : t.toCharArray()) countT[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (countS[i] != countT[i]) return false;
        }

        return true;
    }
}


