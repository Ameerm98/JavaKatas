package katas.exercises;
import katas.exercises.wallet.RateProvider;
import katas.exercises.wallet.Stock;
import katas.exercises.wallet.Utils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class WalletTest {



    @Test
    public void walletTest(){
        class StaticRateProvider implements RateProvider {
            @Override
            public double rate(Utils.StockType from, Utils.Currency to) {
                return 1.0;
            }
        }

        RateProvider staticRateProvider = new StaticRateProvider();

        Wallet wallet = new Wallet(List.of(
                new Stock(5, Utils.StockType.PETROLEUM),
                new Stock(2, Utils.StockType.BITCOIN),
                new Stock(100, Utils.StockType.USD)
        ));

        double walletValue = wallet.value(Utils.Currency.EUR, staticRateProvider);
        assertEquals(107.0,walletValue);

    }


}
