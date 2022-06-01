package Homework3105Methods;

public class getAverageSum {

    public static double getAverageSum(double x, double y, double z) {
        double averageSum = (x + y + z) / 3;
        System.out.println(averageSum);
        return averageSum;

    }

    public static void main(String[] args) {
        getAverageSum(1, 2,3);
        getAverageSum(0.1, 20.5,3);
        getAverageSum(-10, -10.1,10);
        getAverageSum(443, 433,3);
        getAverageSum(-443, 433,3);
        getAverageSum(0.25, 0.001,50.577);
    }

}
