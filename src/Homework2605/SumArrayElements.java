package Homework2605;

public class SumArrayElements {
    public static void main(String[] args) {

        int[] array1 = {10, 20, 30, 40, 50, 2, 9, 7, -8, 0, -10};
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }

        System.out.printf("The sum of the array elements is %d", sum);


    }
}
