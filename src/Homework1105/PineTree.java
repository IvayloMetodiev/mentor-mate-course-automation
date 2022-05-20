package Homework1105;

import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many meters is your pine tree?");
        int treeLevels = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= treeLevels; i++) {

            for (int k = 1; k <= treeLevels-i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
