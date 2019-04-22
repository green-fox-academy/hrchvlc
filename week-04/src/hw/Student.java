package hw;

public class Student {

    String nameOfPerson;
    int ageOfPerson;
    String genderOfPerson;

    String previousOrganisation;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganisation) {
        nameOfPerson = name;
        ageOfPerson = age;
        genderOfPerson = gender;
        this.previousOrganisation = previousOrganisation;
        skippedDays = 0;
    }
    public Student() {
        nameOfPerson = "Jane Doe";
        ageOfPerson = 30;
        genderOfPerson = "female";
        this.previousOrganisation = "The School of Life";
        skippedDays = 0;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer");
    }
    public void introduce() {
        System.out.println("Hi, I'm " + nameOfPerson + ", a " + ageOfPerson + " year old " + genderOfPerson
                + " from " + previousOrganisation
                + " who skipped " + skippedDays + " days from the course already.");
    }
    public void skipDays(int numberOfDays) {
        skippedDays = skippedDays + numberOfDays;
    }
}
