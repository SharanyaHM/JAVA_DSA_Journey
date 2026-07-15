// LC121 - Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Time: O(n) | Space: O(1)

public class LC0121_BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minPrice = Integer.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;
            maxProfit = Integer.max(maxProfit, profit);

        }
        return maxProfit;

    }
}
