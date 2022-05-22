package Homework1805;

import java.util.Scanner;

public class ArrNumbersDivisibleBy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int currentNumber;

        for (int i = 0; i < arr.length; i++) {
            currentNumber = arr[i];
            if (currentNumber > 150) {
                System.exit(0);
            }
            if (currentNumber % 5 == 0) {
                System.out.println(currentNumber);
            }
        }
    }
}
