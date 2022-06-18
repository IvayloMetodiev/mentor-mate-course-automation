package OOPIntroductionPart2;

public class Bulgarian extends Person{
    public Bulgarian(String name, String sex, String religion, String language, String job, String nationality, String personalID, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", personalID, countryOfResidence);
    }

    public void lovesHolidays(){
        System.out.printf("%s loves holidays!", getName());
    }

    public void likesRakia(){
        System.out.printf("%s likes rakia.", getName());
    }
}
