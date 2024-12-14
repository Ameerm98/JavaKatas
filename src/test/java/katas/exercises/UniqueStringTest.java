package katas.exercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UniqueStringTest {
    @Test
    public void testUniqueString(){
        String test1 = "Hello";
        String test2 = "World";
        String test3 = "Java";
        String test4 = "Unique";
        assertFalse(UniqueString.isUnique(test1));
        assertTrue(UniqueString.isUnique(test2));
        assertFalse(UniqueString.isUnique(test3));
        assertTrue(UniqueString.isUnique(test4));
    }


}
