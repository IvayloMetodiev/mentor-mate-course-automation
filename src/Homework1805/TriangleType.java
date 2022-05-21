package Homework1805;

import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angle A:");
        double angleA = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter angle B:");
        double angleB = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter angle C:");
        double angleC = Double.parseDouble(scanner.nextLine());

        double angleSum = angleA + angleB + angleC;

        if (angleSum == 180) {
            if (angleA < 0.001 || angleB < 0.001 || angleC < 0.001) {
                System.out.println("The triangle is not possible.");
                System.out.println("Please enter only positive values.");
            } else {
                if (angleA == 90 || angleB == 90 || angleC == 90) {
                    if (angleA == angleB || angleB == angleC) {
                        System.out.println("The triangle is right-angled, and also isosceles.");
                    } else {
                        System.out.println("The triangle is right-angled.");
                    }
                } else if (angleA < 90 && angleB < 90 && angleC < 90) {
                    if (angleA != angleB && angleB != angleC){
                        System.out.println("The triangle is acute.");
                    } else{
                        System.out.println("The triangle is acute and also isosceles.");
                    }

                } else if (angleA == angleB && angleB == angleC) {
                    System.out.println("The triangle is equilateral and also isosceles.");
                } else if (angleA > 90 || angleB > 90 || angleC > 90) {
                    if (angleA == angleB || angleB == angleC) {
                        System.out.println("The triangle is obtuse and isosceles.");
                    } else {
                        System.out.println("The triangle is obtuse.");
                    }
                } else if ((angleA != angleB && angleB != angleC)) {
                    System.out.println("The triangle is multifaceted.");
                } else {
                    System.out.println("The triangle is isosceles.");
                }

            }
        } else {
            System.out.println("The triangle is not possible.");
        }
    }
}
