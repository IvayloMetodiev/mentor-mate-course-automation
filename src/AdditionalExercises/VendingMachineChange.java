package AdditionalExercises;

import java.util.Scanner;

public class VendingMachineChange {
    public static void main(String[] args) {

        // Write a program for vending machine that will give change in less coins as possible.
        // The input is total change

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the total change amount");
        double totalAmountChange = scanner.nextDouble();

        if (totalAmountChange < 0.01){
            System.out.println("Invalid input. The change can not be less than 0.01 euro.");
            System.exit(0);
        }

        totalAmountChange = totalAmountChange * 100;
        int changeLeft = (int) totalAmountChange;


        int twoEuroCoins = 0;
        int oneEuroCoins = 0;
        int fiftyCentCoins = 0;
        int twentyCentsCoins = 0;
        int tenCentsCoins = 0;
        int fiveCentsCoins = 0;
        int twoCentsCoins = 0;
        int oneCentsCoins = 0;

        while (changeLeft != 0){
            if (changeLeft >= 200){
                twoEuroCoins++;
                changeLeft = changeLeft - 200;
            } else if (changeLeft < 200 && changeLeft >= 100){
                oneEuroCoins++;
                changeLeft = changeLeft - 100;
            } else if (changeLeft < 100 && changeLeft  >=50){
                fiftyCentCoins++;
                changeLeft = changeLeft - 50;
            } else if (changeLeft < 50 && changeLeft  >=20){
                twentyCentsCoins++;
                changeLeft = changeLeft - 20;
            } else if (changeLeft < 20 && changeLeft >= 10){
                tenCentsCoins++;
                changeLeft = changeLeft - 10;
            }else  if (changeLeft < 10 && changeLeft >= 5){
                fiveCentsCoins++;
                changeLeft = changeLeft - 5;
            }else if (changeLeft < 5 && changeLeft >=  2){
                twoCentsCoins++;
                changeLeft = changeLeft - 2;
            }else if (changeLeft < 2 && changeLeft  >= 1){
                oneCentsCoins++;
                changeLeft = changeLeft - 1;
            }
        }

        System.out.println("You receives:");
        System.out.printf("2 euro coins: %d", twoEuroCoins);
        System.out.println();
        System.out.printf("1 euro coins: %d", oneEuroCoins);
        System.out.println();
        System.out.printf("50 cent coins: %d", fiftyCentCoins);
        System.out.println();
        System.out.printf("20 cent coins: %d", twentyCentsCoins);
        System.out.println();
        System.out.printf("10 cent coins: %d", tenCentsCoins);
        System.out.println();
        System.out.printf("5 cent coins: %d", fiveCentsCoins);
        System.out.println();
        System.out.printf("2 cent coins: %d", twoCentsCoins);
        System.out.println();
        System.out.printf("1 cent coins: %d", oneCentsCoins);

    }
}
