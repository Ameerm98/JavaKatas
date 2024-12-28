package katas.exercises;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

public class TimeMeTest {
    @Test
    public void testTimeMe(){
        Runnable sampleFunction = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        long timeTaken = TimeMe.measureExecutionTime(sampleFunction);
        //System.out.println("Time taken by sampleFunction: " + timeTaken + " ms");

        assertTrue(timeTaken>500 && timeTaken<520);

        Runnable quickFunction = () -> System.out.println("Quick task done!");
        timeTaken = TimeMe.measureExecutionTime(quickFunction);
        assertTrue(timeTaken==0);
        //System.out.println("Time taken by quickFunction: " + timeTaken + " ms");
    }
}
