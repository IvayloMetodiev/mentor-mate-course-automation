package Homework3105Methods;

import Homework1805.ReverseArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class isIntPalindrome {

    public static boolean isIntPalindrome(int x){

        String intToString = String.valueOf(x);
        ArrayList<Character> intToChars = new ArrayList<>();


        for (int i = 0; i < intToString.length() ; i++) {
            intToChars.add(intToString.charAt(i));
        }


        System.out.println("Integer:");
        System.out.println(x);


        Collections.reverse(intToChars);

        System.out.println("Reversed integer:");
        String reversedX = String.valueOf(intToChars)
                .replace("[", "")
                .replace(", ", "")
                .replace("]", "");


        int reversedX2 = Integer.valueOf(reversedX);
        System.out.println(reversedX2);


        if (reversedX2 == x){
            System.out.println("Yes, the integer is palindrome.");
            return true;
        }else {
            System.out.println("No, the integer is not palindrome.");
            return false;
        }

    }

    public static void main(String[] args) {
        isIntPalindrome(1122);
        isIntPalindrome(1111);
        isIntPalindrome(11011);
        isIntPalindrome(999);
        isIntPalindrome(1548);
    }

}
