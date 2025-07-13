/*
 * Problem - Reverse Words in a String (Leetcode #151)
 * Difficulty - Medium
 * Link - https://leetcode.com/problems/reverse-words-in-a-string/
 *
 * Topics: Two Pointers, String
 *
 * Approach:
 * - Trim leading/trailing spaces
 * - Split the string by one or more spaces using regex "\\s+"
 * - Reverse the array of words
 * - Join them back with a single space
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "  a good   example  ";

        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}