package OOPIntroductionPart2;

public class Child extends Person{

    public Child(String name, String sex, String religion, String language,String job, String nationality, String personalID, String countryOfResidence) {
        super(name, sex, religion, language, null, nationality, personalID, countryOfResidence);
    }

    @Override
    public boolean isAdult() {
        System.out.println("The person is not adult.");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("Kids can not take loans.");
        return false;
    }

    public void play(){
        System.out.printf("%s loves to play!", getName());
    }

    public void eatsCandies(){
        System.out.printf("%s loves to eat candies!", getName());
    }
}
