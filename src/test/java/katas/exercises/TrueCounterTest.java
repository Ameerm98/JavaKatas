package katas.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrueCounterTest {

    @Test
    public void testTrueCounter(){
        boolean[] sampleArray = {true, false, true, true, false};
        assertEquals(3,TrueCounter.countTrueValues(sampleArray));
    }
}
