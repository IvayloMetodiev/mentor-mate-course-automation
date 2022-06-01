package Homework3105Methods;

import java.util.ArrayList;

public class printMiddleCharInString {

    public static char printMiddleChar(String text) {

        ArrayList<Character> letters = new ArrayList<>();


        for (int i = 0; i < text.length(); i++) {
            letters.add(text.charAt(i));
        }

        //System.out.println(letters);

        if (letters.size() == 1) {
            System.out.println("Your word has just one character " + text);
        } else if (letters.size() == 2) {
            System.out.println("Your word has two characters " + letters);
        } else if (letters.size() % 2 == 0) {
            System.out.println("The word has even count of symbols.");
            System.out.printf("The middle characters are %s and %s.", letters.get((letters.size() / 2) - 1), letters.get((letters.size() / 2)));
            System.out.println();
        } else if (letters.size() % 2 != 0) {
            int middleIndex = (letters.size() / 2);
            char middleChar = letters.get(middleIndex);
            System.out.println("The middle character is " + middleChar);
        }

        return letters.get(0);

    }

    public static void main(String[] args) {
        printMiddleChar("a");
        printMiddleChar("an");
        printMiddleChar("Mentor");
        printMiddleChar("mmAmm");
    }

}
