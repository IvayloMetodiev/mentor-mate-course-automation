package OOPIntroduction.Employees;

import java.util.Random;

public class Employees {
    final String id;
    String firstName;
    String lastName;
    double monthlySalary;

    public Employees(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        this.id = generateID();
    }



    public String generateID(){
        Random random = new Random();
        int randomNum = random.nextInt(100000);
        String randomInString = String.valueOf(randomNum);
        String idPart1 = String.valueOf(firstName.charAt(0));
        String idPart2 = String.valueOf(lastName.charAt(0));
        String idPart3 = String.valueOf(randomNum);
        String finalID = idPart1 + idPart2 + idPart3;
        return finalID;

    }


    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    public String getName() {
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public double getAnnualSalary() {
        double annualSalary = monthlySalary * 12;
        return annualSalary;
    }

    public double raiseSalary(){
        monthlySalary = monthlySalary * 1.1;
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
