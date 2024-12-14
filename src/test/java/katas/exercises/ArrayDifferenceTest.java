package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ArrayDifferenceTest {


    @Test
    public void testArrayDifference(){
        assertEquals(0,ArrayDifference.findDifference(new int[]{0, 0}));
        assertEquals(1,ArrayDifference.findDifference(new int[]{-1, 0}));
        assertEquals(50,ArrayDifference.findDifference(new int[]{100,50 }));
    }
}
