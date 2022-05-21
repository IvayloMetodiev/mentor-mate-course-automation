package Homework1805;

import java.util.Scanner;

public class RevenueCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an quantity:");
        double quantity = scanner.nextDouble();
        System.out.println("Please enter an unit price:");
        double unitPrice = scanner.nextDouble();

        double revenue = quantity * unitPrice;
        double discount = 0;

        if (quantity < 0.01 || unitPrice < 0.001){
            System.out.println("Invalid input. Please enter only positive values");
            System.exit(0);
        }

        if (quantity >= 100 && quantity <=120){
            discount = 15;
            revenue = revenue - (revenue * (discount/100));
        } else if (quantity  > 120){
            discount = 20;
            revenue = revenue - (revenue * (discount/100));
        }

        System.out.println("You ordered:");
        System.out.println();
        System.out.printf("Quantity: %.0f", quantity);
        System.out.println();
        System.out.printf("Unite price : %.2f$", unitPrice);
        System.out.println();
        if (discount > 0){
            System.out.printf("Discount: %.0f%%", discount);
            System.out.println();
        }
        System.out.printf("Total order value: %.2f$", revenue);
    }
}
