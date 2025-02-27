package katas.exercises;

public class StockTrader {

    /**
     * Finds the maximum profit that can be achieved by buying and selling the stock ONCE.
     *
     * Aim for O(n)
     *
     * @param prices an array of prices on each day
     * @return the maximum profit, or 0 if no profit can be achieved
     */
    public static int maxProfit(int[] prices) {
        int b = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>b){
                if (prices[i]-b>maxprofit){
                    maxprofit = prices[i]-b;
                }
            }else {
                b=prices[i];
            }
        }







        return maxprofit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(stockPrices);
        System.out.println("Maximum Profit: " + profit);  // should be 5
    }
}
