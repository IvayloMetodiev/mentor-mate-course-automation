package OOPIntroductionPart2;

public class American extends Person{
    public American(String name, String sex, String religion, String language, String job, String nationality, String personalID, String countryOfResidence) {
        super(name, sex, religion, "English", job, "American", personalID, countryOfResidence);
    }

    public void lovesFastFood(){
        System.out.printf("%s loves fast food.");
    }
}
