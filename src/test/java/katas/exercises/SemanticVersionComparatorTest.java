package katas.exercises;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SemanticVersionComparatorTest {

    @Test
    public void testSemanticVersionComparator(){
        assertEquals(-1,SemanticVersionComparator.compareVersions("1.0.0", "1.0.1"));
        assertEquals(1,SemanticVersionComparator.compareVersions("12.0.0", "1.0.1"));
        assertEquals(0,SemanticVersionComparator.compareVersions("1.0.1", "1.0.1"));
    }
}
