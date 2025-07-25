/*
 * Problem - Best Time to Buy and Sell Stock (Leetcode #121)
 * Difficulty - Easy
 * Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Topics: Array, Dynamic Programming, Two Pointers
 *
 * Approach:
 * - Traverse the array keeping track of the minimum price so far.
 * - At each step, calculate the potential profit by selling at the current price.
 * - Update maxProfit accordingly.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        System.out.println(maxProfit(a));
    }
    static int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;

        for(int i=1;i<prices.length;i++){
            ans = Math.max(ans,prices[i]-min);
            min = Math.min(prices[i],min);
        }

        return ans;
    }
}


