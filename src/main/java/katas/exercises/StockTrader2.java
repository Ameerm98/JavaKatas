package katas.exercises;

public class StockTrader2 {

    /**
     * Finds the maximum profit that can be achieved by buying and selling the stock MULTIPLE times.
     *
     * O(n) is the best complexity
     *
     * @param prices an array of prices on each day
     * @return the maximum profit, or 0 if no profit can be achieved
     */
    public static int maxProfit(int[] prices) {
        int b = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>b){
                maxprofit+=prices[i]-b;
                b = prices[i];
            }else {
                b=prices[i];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int[] stockPrices = {7, 6, 5, 4, 3, 2};
        int profit = maxProfit(stockPrices);
        System.out.println("Maximum Profit: " + profit);  // should be 0
    }
}
