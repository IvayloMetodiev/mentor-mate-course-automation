import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a, b and c.");
        System.out.println("Enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(scanner.nextLine());

        double x1;
        double x2;

        double d = Math.pow(b, 2) - ((4 * a) * c);

        if (d < 0) {
            System.out.println("The mathematical problem has no solution.");
        } else if (d == 0) {
            b = b * -1;
            x1 = b / (2 * a);
            System.out.printf("X is equals to %.2f", x1);
        } else {
            double bMinus = b * -1;
            x1 = (bMinus + Math.sqrt(d)) / (2*a);
            x2 = (bMinus - Math.sqrt(d)) / (2*a);
            System.out.printf("X1 is equals to %.2f", x1);
            System.out.println();
            System.out.printf("X2 is equals to %.2f", x2);
        }
    }
}
