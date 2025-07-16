/*
 * Problem - String to Integer (atoi) (Leetcode #8)
 * Difficulty - Medium
 * Link - https://leetcode.com/problems/string-to-integer-atoi/
 *
 * Topics: String, Simulation
 *
 * Approach:
 * - Step 1: Skip leading whitespaces.
 * - Step 2: Handle optional '+' or '-' sign.
 * - Step 3: Parse digits and build the result while checking for overflow.
 * - Step 4: Return the final result with the appropriate sign.
 *
 * Time Complexity: O(n), where n is the length of the input string.
 * Space Complexity: O(1)
 */


public class StringToInteger {
    public static void main(String[] args) {
        String s = "   -374b131";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        int i = 0, n = s.length();
        
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        int result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}

