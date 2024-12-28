package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;


public class TestCaseGroupingTest {
    List<Integer> testCaseGroupSizes1 = List.of(1, 2, 3, 3, 3, 2);
    @Test
    public void testTestCaseGrouping(){
        List<List<Integer>> res =TestCaseGrouping.groupTestCases(testCaseGroupSizes1);
        List<Integer> L1 = List.of(0);
        assertEquals(L1, res.get(0));
        List<Integer> L2 = List.of(1,5);
        assertEquals(L2, res.get(1));
        List<Integer> L3 = List.of(2,3,4);
        assertEquals(L3, res.get(2));

    }
}
