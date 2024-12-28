package katas.exercises;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefix(){
        String[] test1 = {"flower", "flow", "flight"};
        String[] test2 = {"dog", "racecar", "car"};
        String[] test3 = {"interspecies", "interstellar", "interstate"};
        String[] test4 = {"apple", "apricot", "ape"};


        assertEquals("fl",LongestCommonPrefix.longestCommonPrefix(test1));
        assertEquals("",LongestCommonPrefix.longestCommonPrefix(test2));
        assertEquals("inters",LongestCommonPrefix.longestCommonPrefix(test3));
        assertEquals("ap",LongestCommonPrefix.longestCommonPrefix(test4));

    }
}
