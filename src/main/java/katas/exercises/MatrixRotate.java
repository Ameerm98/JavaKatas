package katas.exercises;

import java.util.ArrayList;

public class MatrixRotate {

    /**
     * Rotates the given square matrix 90 degrees clockwise in place.
     *
     * @param matrix the 2D square matrix to rotate
     */
    public static void rotateMatrix(int[][] matrix) {
        int len = matrix.length-1;
        for (int i = 0; i < matrix.length/2; i++) {
            int[] r1 = matrix[i];
            int[] r2 = matrix[len-i];
            matrix[len] = r1;
            matrix[i] = r2;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i<j){
                    int temp = matrix[j][i];
                    matrix[j][i] =matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Matrix after 90-degree clockwise rotation:");
        printMatrix(matrix);
    }

    /**
     * Helper method to print a 2D matrix.
     *
     * @param matrix the matrix to print
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
