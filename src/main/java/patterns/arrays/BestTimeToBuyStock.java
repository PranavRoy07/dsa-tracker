package patterns.arrays;

// Problem: Best Time to Buy and Sell Stock | Difficulty: Easy | Pattern: Two Pointer / Sliding Window | Source: LeetCode #121 | Time: O(n) | Space: O(1)
public class BestTimeToBuyStock {

    // Brute force: try every buy-sell pair. Time: O(n^2), Space: O(1)
    // public int bruteForce(int[] prices) {
    //     int maxProfit = 0;
    //     for (int i = 0; i < prices.length; i++) {
    //         for (int j = i + 1; j < prices.length; j++) {
    //             maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
    //         }
    //     }
    //     return maxProfit;
    // }

    // Optimised: track the lowest price seen so far, one pass.
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
