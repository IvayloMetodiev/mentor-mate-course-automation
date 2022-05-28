package Homework2605;

import java.util.Arrays;

public class ArraySumDiagonals {
    public static void main(String[] args) {

        int[][] array = new int[4][4];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[1][0] = 5;
        array[1][1] = 6;
        array[1][2] = 7;
        array[1][3] = 8;
        array[2][0] = 9;
        array[2][1] = 10;
        array[2][2] = 11;
        array[2][3] = 12;
        array[3][0] = 13;
        array[3][1] = 14;
        array[3][2] = 15;
        array[3][3] = 16;

        String[][] arrayString = new String[4][4];

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                arrayString[i][j] = String.valueOf(array[i][j]);
            }
        }


        System.out.println("This is the array:");
        System.out.println(Arrays.deepToString(arrayString)
                .replace("],", "\n")
                .replace("[[", "")
                .replace(",", " |")
                .replace(" [", "")
                .replace("]]", ""));

        int firstDiagonalSum = array[0][0] + array [1][1] + array [2][2] + array[3][3];
        int secondDiagonalSum = array[0][3] + array [1][2] + array [2][1] + array[3][0];

        System.out.printf("The sum of the first diagonal is: %d", firstDiagonalSum);
        System.out.println();
        System.out.printf("The sum of the second diagonal is: %d", secondDiagonalSum);
    }
}
