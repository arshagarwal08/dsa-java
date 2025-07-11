/*
 * Problem - Missing Number (Leetcode #268)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/missing-number/
 * 
 * Topic: Arrays, Math
 * 
 * Approach:
 * 1. Calculate the expected sum of numbers from 0 to n using formula: n*(n+1)/2
 * 2. Subtract the actual sum of the array from the expected sum.
 * 3. The difference is the missing number.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MissingNumber {
    public static void main(String[] args) {
        int []array = {9,6,4,2,3,5,7,0,1};

        System.out.println("Missing number is: " + missing(array));
    }
    static int missing(int[] a){
        int n = a.length;
        int sum=0;

        for(int i : a) sum += i;

        int x = (n*(n+1))/2;

        return x-sum;
    }
}
