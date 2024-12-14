package katas.exercises;

public class TrueCounter {

    /**
     * Counts the number of true values in the given boolean array.
     *
     * @param array the boolean array to check
     * @return the count of true values in the array
     */
    public static int countTrueValues(boolean[] array) {
        int count = 0;
        for(boolean fl :array){
           if(fl){
               count+=1;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        boolean[] sampleArray = {true, false, true, true, false};
        int trueCount = countTrueValues(sampleArray);
        System.out.println(trueCount);
    }
}
