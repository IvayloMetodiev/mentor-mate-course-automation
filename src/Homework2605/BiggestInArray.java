package Homework2605;

import java.lang.reflect.Array;

public class BiggestInArray {
    public static void main(String[] args) {

        int [] array = {10, 20, 30, 40, 50, -100, 7, 42};
        int biggestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > biggestNumber) {
                biggestNumber = array[i];
            }
        }

        System.out.printf("The biggest number in the array is %d", biggestNumber);
    }
}
