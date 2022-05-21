package Homework1805;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What kind of vacation do you prefer?");
        System.out.println("Please enter Beach or Mountain");
        String vacationType = scanner.nextLine();

        if ((!vacationType.equals("Beach") && (!vacationType.equals("Mountain")))) {
            System.out.println("At that moment we can offer you only Beach or Mountain vacation");
            System.exit(0);
        }

        System.out.println("What is your daily budget?");
        double dailyBudget = scanner.nextDouble();

        if (dailyBudget < 10) {
            System.out.println("We do not have a vacation offer for less than 10$. Please try again.");
            System.exit(0);
        } else if (dailyBudget > 10000) {
            System.out.println("Our most expensive vacation is 10 000$. Please try again and select daily price range between 10$ and 10 000$");
            System.exit(0);
        }


        if (vacationType.equals("Beach")) {
            if (dailyBudget < 50) {
                System.out.println("We can recommend you a beach vacation in Bulgaria.");
            } else if (dailyBudget >= 50) {
                System.out.println("We can recommend you a beach vacation Outside Bulgaria.");
            }
        } else if (vacationType.equals("Mountain")) {
            if (dailyBudget < 30) {
                System.out.println("We can recommend you a mountain vacation in Bulgaria.");
            } else if (dailyBudget >= 30) {
                System.out.println("We can recommend you a mountain vacation Outside Bulgaria.");
            }
        }

    }
}
