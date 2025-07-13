/*
 * Problem - Largest Odd Number in String (Leetcode #1903)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/largest-odd-number-in-string/
 *
 * Topics: String
 *
 * Approach:
 * - Traverse the string from the end
 * - Return the substring up to the first encountered odd digit
 * - If no odd digit is found, return an empty string
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String s = "82374";

        System.out.println(largestOddNumber(s));
    }

    static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0) return num.substring(0,i+1);
        }

        return "";
    }
}
