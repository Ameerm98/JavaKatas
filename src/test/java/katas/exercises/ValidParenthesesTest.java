package katas.exercises;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {


    @Test
    public void testValidParenthesis(){
        String validInput = "()[]{}";
        String invalidInput1 = "(]";
        String invalidInput2 = "([)]";
        String validInputNested = "{[()]}";

        assertTrue(ValidParentheses.isValidParentheses(validInput));
        assertFalse(ValidParentheses.isValidParentheses(invalidInput1));
        assertTrue(ValidParentheses.isValidParentheses(invalidInput2));
        assertTrue(ValidParentheses.isValidParentheses(validInputNested));
    }

}
