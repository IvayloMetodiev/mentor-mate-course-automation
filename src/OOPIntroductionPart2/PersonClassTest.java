package OOPIntroductionPart2;

public class PersonClassTest {


    public static void main(String[] args) {

        Person person1 = new Person("Ivaylo Metodiev", "Male", "Orthodox", "Bulgarian", "QA", "Bulgarian", "9402150000", "Bulgaria");
        Person person2 = new Person("Nadya Dimitrova", "Female", "Catholic", "Italian", null, "Italian", "0152100000", "Italy");
        Person person3 = new Person("Simeon Todorov", "Male", "Muslim", "English", "Software Developer", "American", "0442100000", "USA");


        System.out.println(person1);
        person1.sayHello(person1.getLanguage());
        person1.canTakeLoan();
        person1.celebratesEaster();

        System.out.println();

        System.out.println(person2);
        person2.sayHello(person2.getLanguage());
        person2.canTakeLoan();
        person2.celebratesEaster();

        System.out.println();

        System.out.println(person3);
        person3.sayHello(person3.getLanguage());
        person3.canTakeLoan();
        person3.celebratesEaster();

        Child child1 = new Child("Ivan Pertrov", "Male", "Orthodox", "Bulgarian", "test", "Bulgarian", "0045153967", "Canada");

        System.out.println(child1);
        child1.canTakeLoan();
        child1.isAdult();

        Bulgarian bulgarian1 = new Bulgarian("Neli Ivanova", "Female", "Muslim", "x", "Office assistant", "x", "9402159988", "USA");

        System.out.println(bulgarian1);
        bulgarian1.celebratesEaster();
        bulgarian1.getJob();
        bulgarian1.isAdult();

    }


}
