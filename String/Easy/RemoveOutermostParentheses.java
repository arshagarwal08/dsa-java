/*
 * Problem - Remove Outermost Parentheses (Leetcode #1021)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/remove-outermost-parentheses/
 *
 * Topics: String, Stack
 *
 * Approach:
 * - Initialize a counter to track the depth of parentheses.
 * - Traverse each character in the string:
 *   - If '(', increment the counter; if depth > 0, append to result.
 *   - If ')', decrement the counter; if depth > 0 after decrementing, append to result.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the result string
 */

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";

        System.out.println("After removing: " + removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        
        for(char c : s.toCharArray()){
            if(c=='('){
                if(count>0) ans.append(c);
                count++;
            }else{
                count--;
                if(count>0) ans.append(c);
            }
        }

        return ans.toString();
    }
}
