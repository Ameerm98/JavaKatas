package katas.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class MinStackTest {
    @Test
    public void test1(){
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        assertEquals(-3,stack.getMin());
        stack.pop();
        assertEquals(0,stack.top());
        assertEquals(-2,stack.getMin());
    }
}
