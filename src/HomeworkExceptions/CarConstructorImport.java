package HomeworkExceptions;

public class CarConstructorImport {
    public static void main(String[] args) {

        Car car1 = new Car("Skoda", "Black", 2006,170, true);
        Car car2 = new Car("Red", 2010, 163, false);
        Car car3 = new Car("Misubishi", "Gray", 2003, true);
        Car car4 = new Car("BWM", "Green", 2020,200);
        Car car5 = new Car("Mazda", "Blue", false);
        Car car6 = new Car();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
    }
}
