package OOPIntroduction.Employees;

import java.security.SecureRandom;
import java.util.Random;

public class Employees {
    String id;
    String firstName;
    String lastName;
    double monthlySalary;

    public Employees(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        
    }


    public String fixedTheID(){
        if (id == null){
            id = generateID();
        } else {
            id = id;
        }

        return id;
    }

    public String getId() {
        return id;
    }


    public String generateID(){
        if (id == null){
            SecureRandom secureRandom = new SecureRandom();
            int randomNum = secureRandom.nextInt(100000);
            String idPart1 = String.valueOf(firstName.charAt(0));
            String idPart2 = String.valueOf(lastName.charAt(0));
            String idPart3 = String.valueOf(randomNum);
            String finalID = idPart1 + idPart2 + idPart3;
            return finalID;
        } else {
            return id;
        }
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
