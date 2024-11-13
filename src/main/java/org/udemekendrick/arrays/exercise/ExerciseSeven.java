package org.udemekendrick.arrays.exercise;

// You are given an array "prices" where "price[i]" is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy
// one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you can not achieve
// any transaction return 0.

public class ExerciseSeven {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int minPrice = Integer.MIN_VALUE;
        int maxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxPrice) {
                maxPrice = prices[i] - minPrice;
            }
        }
        return maxPrice;
    }
}
