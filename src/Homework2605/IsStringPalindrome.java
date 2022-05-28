package Homework2605;

import java.util.ArrayList;
import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in a word");
        String word = scanner.nextLine();

        ArrayList<Character> wordLetters = new ArrayList<>();

        for (int i = 0; i < word.length() ; i++) {
            wordLetters.add(word.charAt(i));
        }

        System.out.println("The word is spelled:");
        System.out.println(wordLetters);

        ArrayList<Character> reversWordList = new ArrayList<>();

        for (int j = wordLetters.size()-1; j >= 0; j--) {
            reversWordList.add(wordLetters.get(j));
        }

        System.out.println("The word spelled backwards is:");
        System.out.println(reversWordList);
        String reversedWordFull = String.valueOf(reversWordList);


        reversedWordFull = ((reversedWordFull)
                .replace("[","")
                .replace(", ", "")
                .replace("]", ""));

        if (word.equals(reversedWordFull)) {
            System.out.println("Yes, the word is palindrome.");

        }else {
            System.out.println("Word is not palindrome.");
        }
    }
}
