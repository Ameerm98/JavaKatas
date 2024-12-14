package katas.exercises;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class MatrixRotateTest {

    @Test
    public void testMatrixRotate(){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] rotatedmatrix = {{7,4,1},{8,5,2},{9,6,3}};



        MatrixRotate.rotateMatrix(matrix);
        int i, j;
        for (i = 0; i < matrix.length; i++)
            for (j = 0; j < matrix.length; j++)
                assertEquals(matrix[i][j] , rotatedmatrix[i][j]);
    }



}
