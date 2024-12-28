package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StockTrader2Test {
    @Test
    public void testStockTrader2(){
        int[] stockPrices = {7, 6, 5, 4, 3, 2};
        assertEquals(0,StockTrader2.maxProfit(stockPrices));

    }
}
