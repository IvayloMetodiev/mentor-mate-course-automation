package OOPIntroductionPart2;

import java.time.LocalDate;

public class Person {
    final String name;
    String sex;
    String religion;
    String language;
    String job;
    final String nationality;
    String personalID;
    final LocalDate dateOfBirth;
    short age;
    String countryOfResidence;

    public Person(String name, String sex, String religion, String language, String job, String nationality, String personalID, String countryOfResidence) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;

        try {
            if (personalID.length() == 10) {
                this.personalID = personalID;
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException ia) {
            System.out.println("Invalid personal ID length.");
        }

        int yearOfBirth = 0;
        int monthOfBirth = 0;
        int dateOfBirth = 0;

        try {
            if (sex.equals("Male") || sex.equals("Female") || sex.equals("F") || sex.equals("M")) {
                this.sex = sex;
            } else {
                throw new IllegalAccessException();
            }
        } catch (IllegalAccessException ie) {
            System.out.printf("Invalid sex format. Please use Male or M and Female or F as input.");
        }

        if (personalID.substring(2, 3).equals("0")) {
            yearOfBirth = 1900 + Integer.parseInt(personalID.substring(0,2));
            monthOfBirth = Integer.parseInt(personalID.substring(2,4));
            dateOfBirth = Integer.parseInt(personalID.substring(4,6));
        } else if (personalID.substring(2, 3).equals("4") || (personalID.substring(2, 3).equals("5"))) {
            yearOfBirth = 2000 + Integer.parseInt(personalID.substring(0, 2));
            monthOfBirth = Integer.parseInt(personalID.substring(2,4)) - 40;
            dateOfBirth = Integer.parseInt(personalID.substring(4,6));
        } else {
            System.out.println("Invalid personal ID!");
        }

        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dateOfBirth);
        this.age = (short) (LocalDate.now().getYear() - yearOfBirth);


    }

    public void sayHello(String language) {
        String hello = null;
        if (language.equals("Bulgarian")) {
            hello = "Здравей";
        } else if (language.equals("Italian")) {
            hello = "Chao";
        } else if (language.equals("English")) {
            hello = "Hello";
        }

        System.out.printf("%s, my name is %s!", hello, getName());
    }

    public boolean celebratesEaster() {

        if ("orthodox".equals(getReligion().toLowerCase()) || ("catholic".equals(getReligion().toLowerCase()))) {
            System.out.println("He/She celebrates Easter.");
            return true;
        } else {
            System.out.println("He/She does not celebrate Easter.");
            return false;
        }
    }

    public boolean isAdult() {
        if (getCountryOfResidence().equals("USA")) {
            if (getAge() >= 21) {
                System.out.println("The person is adult.");
                return true;
            } else {
                System.out.println("The person is adult.");
                return false;
            }
        } else {
            if (getAge() >= 18) {
                System.out.println("The person is adult.");
                return true;
            } else {
                System.out.println("The person is not adult.");
                return false;
            }
        }
    }

    public boolean canTakeLoan(){
        if (getCountryOfResidence().equals("USA")){
            if (getAge() > 21 && getJob() != null){
                System.out.println("The person can take loan.");
                return true;
            } else {
                System.out.println("The person can not take loan.");
                return false;
            }

        } else {
            if (getAge() >=18 && getJob() != null){
                System.out.println("The person can take loan.");
                return true;
            } else {
                System.out.println("The person can not take loan.");
                return false;
            }
        }
    }




    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguage() {
        return language;
    }

    public String getJob() {
        return job;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPersonalID() {
        return personalID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public short getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", language='" + language + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", personalID='" + personalID + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                '}';
    }
}
