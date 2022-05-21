package Homework1805;

import java.util.Scanner;

public class WorkingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if (age >= 16 && age <= 120) {
            System.out.println("You are eligible to work.");
        } else if (age < 16 && age >= 0){
            System.out.println("You are NOT eligible to work.");
        } else {
            System.out.println("Your input is invalid, please try again.");
        }
    }
}
