package katas.exercises;

public class ValidParentheses {

    /**
     * Checks if a given string has valid parentheses (try in O(n)).
     *
     * A string has valid parentheses if:
     * 1. Every opening parenthesis has a matching closing parenthesis.
     * 2. The parentheses are correctly nested.
     *
     * @param s the input string containing parentheses
     * @return true if the string has valid parentheses, false otherwise
     */
    public static boolean isValidParentheses(String s) {
        // Hint for efficient implementation: stack
        int[] arr={0,0,0};
        char[] str = s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (str[i]=='('){
                arr[0]+=1;
            } else if (str[i]=='[') {
                arr[1]+=1;
            } else if (str[i]=='{') {
                arr[2]+=1;
            } else if (str[i]==')') {
                if (arr[0]>0){
                    arr[0]-=1;
                }else {
                    return false;
                }
            } else if (str[i]==']') {
                if (arr[1]>0){
                    arr[1]-=1;
                }else {
                    return false;
                }
            } else if (str[i]=='}') {
                if (arr[2]>0){
                    arr[2]-=1;
                }else {
                    return false;
                }
            }
        }

        for (int val:arr){
            if (val!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String validInput = "()[]{}";
        String invalidInput1 = "(]";
        String invalidInput2 = "([)]";
        String validInputNested = "{[()]}";

        System.out.println("Is valid: " + isValidParentheses(validInput));
        System.out.println("Is valid: " + isValidParentheses(invalidInput1));
        System.out.println("Is valid: " + isValidParentheses(invalidInput2));
        System.out.println("Is valid: " + isValidParentheses(validInputNested));
    }
}
