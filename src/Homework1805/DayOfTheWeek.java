package Homework1805;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of the week day (1-7):");
        int dayNumber = scanner.nextInt();
        String dayName=null;
        String daySuperscript=null;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                daySuperscript = "-st";
                break;
            case 2:
                dayName = "Tuesday";
                daySuperscript = "-nd";
                break;
            case 3:
                dayName = "Wednesday";
                daySuperscript = "-rd";
                break;
            case 4:
                dayName = "Thursday";
                daySuperscript = "-th";
                break;
            case 5:
                dayName = "Friday";
                daySuperscript = "-th";
                break;
            case 6:
                dayName = "Saturday";
                daySuperscript = "-th";
                break;
            case 7:
                dayName = "Sunday";
                daySuperscript = "-th";
                break;
            default:
                System.out.println("Invalid input. Please enter value between 1 and 7.");
        }


        if (dayNumber >= 1 && dayNumber <=7){
            System.out.printf("The %d%s day of the week is %s.", dayNumber, daySuperscript,dayName);
        }

    }
}
