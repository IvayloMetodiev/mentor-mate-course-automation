package Homework3105Methods;

import java.util.ArrayList;

public class countWords {

    public static int countWords(String text) {

        ArrayList<Character> charedText = new ArrayList<>();

        int spaceCounter = 1;

        for (int i = 0; i < text.length(); i++) {
            charedText.add(text.charAt(i));
        }

        for (int i = 0; i < charedText.size()-1; i++) {
            if (charedText.get(i).equals(' ')){
                spaceCounter++;
            }
        }

        //System.out.println(charedText);
        System.out.printf("Your text contains %d words", spaceCounter);
        return spaceCounter;

    }

    public static void main(String[] args) {
        countWords("One two three four");
    }


}
