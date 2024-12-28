package katas.exercises;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxStorageCapacityTest {
    @Test
    public void testMaxStorageCapacity(){
        int[] containers = {2, 1, 5, 6, 2, 3};
        assertEquals(10,MaxStorageCapacity.maxStorageArea(containers));
    }
}
