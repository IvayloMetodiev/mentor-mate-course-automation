package Homework2605;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFromUserInputString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> bestFriends = new ArrayList<>();

        System.out.println("Who is your best friend?");
        String friendNameInput = scanner.nextLine();
        bestFriends.add(friendNameInput);
        int friendsCounter = 1;

        while (!friendNameInput.equals("That's all")){
            System.out.println("Do you have other best friend? (if you don't have type in (\"That's all\")");
            friendNameInput = scanner.nextLine();
            if (friendNameInput.equals("That's all")){
                break;
            }
            bestFriends.add(friendNameInput);
            friendsCounter++;
        }

        if (friendsCounter == 1){
            System.out.printf("You have one best friend. His/her name is %s.", bestFriends.get(0));
        } else {
            System.out.printf("You have %d best friends.", friendsCounter);
            System.out.println();
            System.out.println("That's the list of all your best friends:");
            System.out.println(bestFriends);
        }


    }

}
