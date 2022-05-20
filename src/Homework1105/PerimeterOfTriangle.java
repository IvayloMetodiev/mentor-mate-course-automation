package Homework1105;

import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the type of your triangle?");
        System.out.println("Please enter a type (Equilateral, Isosceles or Scalene):");

        String triangleType = scanner.nextLine();

        if (triangleType.equals("Equilateral")) {
            System.out.println("Please enter a side");
            double side = Double.parseDouble(scanner.nextLine());
            double perimeter = 3 * side;
            System.out.printf("The perimeter of your triangle is %.2f", perimeter);
        }
        else if (triangleType.equals("Isosceles")) {
            System.out.println("Please enter one of the equal sides");
            double equalSide = Double.parseDouble(scanner.nextLine());
            System.out.println("Please enter the not equal side");
            double notEqualSide = Double.parseDouble(scanner.nextLine());
            double perimeter = (2 * equalSide) + notEqualSide;
            System.out.printf("The perimeter of your triangle is %.2f", perimeter);
        }
        else if (triangleType.equals("Scalene")) {
            System.out.println("Enter side a:");
            double sideA = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter side b:");
            double sideB = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter side c:");
            double sideC = Double.parseDouble(scanner.nextLine());

            double perimeter = sideA + sideB + sideC;

            System.out.printf("The perimeter of triangle is %.2f", perimeter);
        }
        else {
            System.out.println("Invalid triangle type!");
        }

    }
}
