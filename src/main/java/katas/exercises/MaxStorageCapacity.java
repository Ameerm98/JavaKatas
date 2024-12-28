package katas.exercises;
import java.util.Stack;

public class MaxStorageCapacity {

    /**
     * Finds the largest rectangular area that can be formed using one or more of the given containers.
     *
     * @param containers an array of integers representing the heights of containers
     * @return the area of the largest rectangle formed between containers
     */
    public static int maxStorageArea(int[] containers) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = containers.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && containers[i] < containers[stack.peek()]) {
                int height = containers[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int height = containers[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] containers = {2, 1, 5, 6, 2, 3};

        int result = maxStorageArea(containers);
        System.out.println("Max storage area: " + result); // Expected output: 10
    }
}
