package Homework2605;

public class Array3X4 {
    public static void main(String[] args) {

        int[][] array3x4 = new int[3][4];
        array3x4[0][0] = 1;
        array3x4[0][1] = 2;
        array3x4[0][2] = 3;
        array3x4[0][3] = 4;
        array3x4[1][0] = 5;
        array3x4[1][1] = 6;
        array3x4[1][2] = 7;
        array3x4[1][3] = 8;
        array3x4[2][0] = 9;
        array3x4[2][1] = 10;
        array3x4[2][2] = 11;
        array3x4[2][3] = 12;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(array3x4[i][j]);
            }
        }
    }
}



