
package java_DSA.array;


/*
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 */



public class Stock_Buy_sell {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi = 0 ,profit = 0;
        int minSell = prices[0];

        for(int i = 0 ; i <n ; i++){

            profit = prices[i] - minSell;
            maxi = Math.max(profit, maxi);  // maximum profit 
            
            minSell = Math.min(prices[i], minSell); // it will find minimum sell value from the recent buying value to the past values. 
        }
        return maxi;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit will be : " + maxProfit(prices));
    }
}
