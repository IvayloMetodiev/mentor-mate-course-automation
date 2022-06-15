package OOPIntroduction.Employees;

public class EmployeesMain {



    public static void main(String[] args) {

        Employees employees1 = new Employees("Ivaylo", "Metodiev", 3500);
        Employees employees2 = new Employees("Ivan", "Ivanov", 2100);
        Employees employees3 = new Employees("Petar", "Marinov", 1700);
        Employees employees4 = new Employees("Madlen", "Nikolova", 4200);

        System.out.println(employees1);
        System.out.println(employees2);
        System.out.println(employees3);
        System.out.println(employees4);

        System.out.println();
        System.out.println();


        System.out.printf("Current annual salary of employee %s with id %s is %.2f BGN." +"\n", employees1.getName(), employees1.id,employees1.getAnnualSalary());
        employees1.raiseSalary();
        System.out.printf("The annual salary after the raise is going to be %.2f BGN.", employees1.getAnnualSalary());

    }
}
