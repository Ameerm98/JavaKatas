package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringDigitSumTest {


    @Test
    public void testStringDigitSum(){
        assertEquals(6,StringDigitSum.sumOfDigits("abc123"));
        assertEquals(0,StringDigitSum.sumOfDigits("abc"));
        assertEquals(0,StringDigitSum.sumOfDigits("abc000"));
    }
}
