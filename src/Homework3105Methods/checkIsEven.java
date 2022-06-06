package Homework3105Methods;

public class checkIsEven {

    public static boolean checkIsEven (int x){
        boolean isEven;
        if (x % 2 == 0){
            isEven = true;
            System.out.printf("The number %d is even.%n", x);
        } else {
            isEven = false;
            System.out.printf("The number %d is odd.%n", x);
        }

        return isEven;
    }

    public static void main(String[] args) {
        checkIsEven(4);
        checkIsEven(2);
        checkIsEven(3);
        checkIsEven(15);
        checkIsEven(152);
        checkIsEven(151);
        checkIsEven(300);
        checkIsEven(250);
    }
}
