package OOPIntroductionPart2;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, String language, String job, String nationality, String personalID, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", personalID, countryOfResidence);
    }

    public void likesPasta(){
        System.out.printf("%s loves to eat pasta!");
    }

}


