package katas.exercises;

import java.util.Arrays;

public class ArrayDifference {

    /**
     * Finds the difference between the largest and smallest numbers in the array.
     *
     * @param numbers the array of integers
     * @return the difference between the largest and smallest numbers
     */
    public static int max(int[] numbers){
        int mx = numbers[0];
        for (int elm: numbers){
            if(elm>mx){
                mx = elm;
            }
        }
        return mx;
    }
    public static int min(int[] numbers){
        int mn = numbers[0];
        for (int elm: numbers){
            if(elm<mn){
                mn = elm;
            }
        }
        return mn;
    }
    public static int findDifference(int[] numbers) {


        return max(numbers)-min(numbers);
    }

    public static void main(String[] args) {
        int[] sampleArray = {10, 3, 5, 6, 20, -2};
        int difference = findDifference(sampleArray);
        System.out.println(difference);
    }
}
