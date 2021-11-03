package ca.javacourse.Class_14;

import java.math.BigDecimal;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] choseNumbers = new int[3];
        int[] c2 = new int[] {9, 10, 11};

        int[][]scores = new int[2][3];// multidimensional array
        int[][] s2 = new int[][] {{1, 2}, {2, 1}};

        choseNumbers[2] = 3;
        System.out.println(choseNumbers[2]);

        scores[0][0] = 77;
        scores[1][2] = 88;

        BigDecimal[] prices = new BigDecimal[4];


    }
}
