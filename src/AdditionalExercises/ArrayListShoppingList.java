package AdditionalExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList shoppingList = new ArrayList();


        System.out.println("Add a product into your shopping list:");
        String product = scanner.nextLine();

        shoppingList.add(product);

        while (!product.equals("ready")) {
            System.out.println("Do you want to add something else?");
            System.out.println("When you are done with the shopping list, just type in \"ready\"");
            product = scanner.next();
            if (product.equals("ready")) {
                break;
            }
            shoppingList.add(product);
        }

        System.out.println("Your shopping list:");
        for (Object element : shoppingList) {
            System.out.println(element);
        }

        System.out.println("If you want to delete something from the list type in \"delete\"");
        System.out.println("If you are done with the list type in \"done\"");
        String editList = scanner.next();
        if (editList.equals("delete")) {
            System.out.println("Type in the name of the product you want to remove");
            String removeProduct = scanner.next();

            if (shoppingList.contains(removeProduct)) {
                shoppingList.remove(removeProduct);
                while (!removeProduct.equals("done")) {
                    System.out.println("Is there other product you want to remove?");
                    System.out.println("If there is not type in \"done\".");
                    removeProduct = scanner.next();
                    if (removeProduct.contains(removeProduct)) {
                        shoppingList.remove(removeProduct);
                    }
                    if (removeProduct.equals("done")) {
                        System.out.println("You are ready to go shopping.");
                        System.out.println("Final shopping list:");
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println(shoppingList.get(i));
                        }
                    }
                }

            } else {
                System.out.println("The product is not in the list.");
                System.out.println("Your shopping list:");
                for (int i = 0; i < shoppingList.size(); i++) {
                    System.out.println(shoppingList.get(i));
                }
            }
        }
    }
}
