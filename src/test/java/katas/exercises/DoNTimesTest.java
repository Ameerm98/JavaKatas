package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DoNTimesTest {

    @Test
    public void testDoNTimes(){
        int[] var = new int[]{0};
        Runnable func = ()->{var[0]++;};
        DoNTimes.doNTimes(func,4);
        assertEquals(4,var[0]);
    }
}
