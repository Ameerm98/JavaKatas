package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class CircularBufferTest {
    @Test
    public void test1(){
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        assertTrue(!buffer.isEmpty()); // Output: true
        assertTrue(buffer.get()==1); // Output: 1
        buffer.add(4);
        assertTrue(buffer.get()==2); // Output: 2
        buffer.add(5);
        assertTrue(buffer.isFull()); // Output: true

    }

}
