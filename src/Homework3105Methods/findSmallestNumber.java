package Homework3105Methods;

public class findSmallestNumber {


    public static int findSmallestNumber(int x, int y, int z) {
        int biggestNumber;
        if (x > y && x > z) {
            biggestNumber = x;
            System.out.println(biggestNumber);
        } else if (y > x && y > z) {
            biggestNumber = y;
            System.out.println(biggestNumber);
        } else if (z > x && z > y) {
            biggestNumber = z;
            System.out.println(biggestNumber);
        } else {
            biggestNumber = x;
            System.out.println(biggestNumber);
        }
        return biggestNumber;
    }

    public static void main(String[] args) {

        findSmallestNumber(1, 2, 3);
        findSmallestNumber(11, 22, 33);
        findSmallestNumber(30, 1, 199);
        findSmallestNumber(-10, 20, 21);
        findSmallestNumber(7, 7, 7);
        findSmallestNumber(-5, -5, -5);
        findSmallestNumber(3000, 2999, 2998);
    }

}
