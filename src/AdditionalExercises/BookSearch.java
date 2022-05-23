package AdditionalExercises;

import java.util.Scanner;

public class BookSearch {
    public static void main(String[] args) {
        // You are looking for your favorite book at the your grandmothers library.
        // You will check all the books until you find it or until you check all the books.
        // The program ends when you find your favorite book or when the input is "No more books"

        Scanner scanner = new Scanner(System.in);


        System.out.println("Type in your favorite  book.");
        String favoriteBook = scanner.nextLine();
        System.out.println("Type in the name of the current book that you are checking.");
        String currentBook = scanner.nextLine();

        int bookCounter = 0;

        while (!currentBook.equals(favoriteBook)) {
            System.out.println("Type in the name of the current book that you are checking.");
            currentBook = scanner.nextLine();
            bookCounter++;
            if (currentBook.equals("No more books")) {
                bookCounter = bookCounter - 1;
                System.out.printf("You have checked %d books, but you could not find your favorite one.", bookCounter);
                break;
            }

        }

        if (currentBook.equals(favoriteBook)){
            System.out.printf("You have checked %d book and you found your favorite book - %s.", bookCounter, favoriteBook);
        }
    }
}
