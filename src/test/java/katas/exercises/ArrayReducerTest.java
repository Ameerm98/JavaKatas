package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayReducerTest {


    @Test
    public void testArrayReducer(){
        int res[] = {1, 2};
        ArrayReducer.reduceArray(res);
        assertTrue(Arrays.equals(res, new int[]{1, 1}));
    }
}
