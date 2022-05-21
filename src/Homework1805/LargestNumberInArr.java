package Homework1805;

public class LargestNumberInArr {
    public static void main(String[] args) {

        int[] arrName = {1, 40, 340, 12, 9, -12};
        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < arrName.length; i++) {
            if (arrName[i] > largestNumber) {
                largestNumber = arrName[i];
            }
        }

        for (int j = 0; j < arrName.length; j++){
            if (arrName[j] < smallestNumber){
                smallestNumber = arrName[j];
            }
        }

        System.out.printf("The largest number in the array is %d", largestNumber);
        System.out.println();
        System.out.printf("The smallest number in the array is %d", smallestNumber);


    }
}
