package Homework2605;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFromUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("Which is your favorite number?");
        String favoriteNumbers = scanner.nextLine();
        int favoriteNumbsCastedToInt = Integer.parseInt(favoriteNumbers);
        numbers.add(favoriteNumbsCastedToInt);

        while (!favoriteNumbers.equals("Don't have")){
            System.out.println("Do you have other favorite numbers. (if you don't have type in (\"Don't have\")");
            favoriteNumbers = scanner.nextLine();
            if (favoriteNumbers.equals("Don't have")){
                break;
            }
            favoriteNumbsCastedToInt = Integer.parseInt(favoriteNumbers);
            numbers.add(favoriteNumbsCastedToInt);
        }

        System.out.println("Your favorite numbers are:");
        System.out.println(numbers);

        }
    }

