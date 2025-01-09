package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.List;


public class OrderedMapTest {


    @Test
    public void testOrderedMap(){
        OrderedMap<String, Integer> orderedMap = new OrderedMap<>();
        orderedMap.put("One", 1);
        orderedMap.put("Two", 2);
        orderedMap.put("Three", 3);
        List<String> keys = orderedMap.keys();
        assertEquals("One", keys.get(0));
        assertEquals("Two", keys.get(1));
        assertEquals("Three", keys.get(2));

        orderedMap.remove("Two");
        keys = orderedMap.keys();
        assertEquals("One", keys.get(0));
        assertEquals("Three", keys.get(1));
        orderedMap.put("Two", 22);
        keys = orderedMap.keys();
        assertEquals("One", keys.get(0));
        assertEquals("Three", keys.get(1));
        assertEquals("Two", keys.get(2));
        assertEquals(3, orderedMap.size());
        orderedMap.clear();
        assertEquals(0, orderedMap.size());
    }

}
