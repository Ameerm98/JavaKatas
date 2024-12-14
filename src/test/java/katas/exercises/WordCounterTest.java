package katas.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    public void testWordCounter(){
        String sentence = "This is a sample sentence for counting words.";
        assertEquals(8,WordCounter.countWords(sentence));


    }
}
