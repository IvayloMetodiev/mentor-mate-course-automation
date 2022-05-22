package Homework1805;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arrNumbers = {10, 20, 30, 40, 50};

        for (int i = arrNumbers.length-1; i >= 0; i--) {
            System.out.println(arrNumbers[i]);
        }
    }
}
