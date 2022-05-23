package AdditionalExercises;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        // Student is at an exam. He/She receives different grade for each task.
        // The program stops when it take "Enough" as input.
        // At the end the program prints the average results of all the tasks.
        // If the student got too many poor grades (2 or 3) the program also stops.
        // The amount of poor grades also comes as input.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the acceptable amount of poor grades");
        int poorGradesLimit = scanner.nextInt();
        String taskName = scanner.nextLine();
        double taskCounter = 0;
        double gradeSum = 0;
        double currentGrade;
        int poorGradeCounter = 0;
        double averageGrade;


        while (!taskName.equals("Enough")){
            System.out.println("Type in the name of the task. (\"example task 1, 2, 3 or Enough\")");
            taskName = scanner.next();

            if (taskName.equals("Enough")){
                break;
            }

            System.out.println("Type in a grade for the current task.");
            currentGrade = scanner.nextDouble();
            taskCounter++;
            gradeSum = gradeSum + currentGrade;

            if (currentGrade < 4){
                poorGradeCounter++;
                if (poorGradeCounter == poorGradesLimit){
                    System.out.printf("You got %.0f poor grade. Take a break.", taskCounter);
                    break;
                }
            }
        }

        if (taskName.equals("Enough")){
            averageGrade = gradeSum / taskCounter;
            System.out.println("Congratulation!");
            System.out.printf("You successfully completed %.0f task", taskCounter);
            System.out.println();
            System.out.printf("You average score is %.2f", averageGrade);
        }

    }
}
