package HomeworkExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTwoNumbersPlusExceptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberA = 0;
        int numberB = 0;
        int result = 0;

        try {
            System.out.println("Enter number a:");
            numberA = scanner.nextInt();
            System.out.println("Enter number b:");
            numberB = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input, please provide only numbers.");
            throw new RuntimeException(ime);
        }

        try {
            result = numberA / numberB;
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero is forbidden.");
            throw new RuntimeException(ae);
        }


        System.out.printf("%d/%d=%d", numberA, numberB, result);

    }

}
