package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StockTraderTest {

    @Test
    public void testStockTrader(){
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        assertEquals(5,StockTrader.maxProfit(stockPrices));

    }
}
