package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;


public class SlidingWindowMaximumTest {

    @Test
    public void testSlidingWindowMaximum(){
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        List<Integer> result = SlidingWindowMaximum.maxSlidingWindow(nums, k);
        assertEquals(3,result.get(0));
        assertEquals(3,result.get(1));
        assertEquals(5,result.get(2));
        assertEquals(5,result.get(3));
        assertEquals(6,result.get(4));
        assertEquals(7,result.get(5));
    }
}
