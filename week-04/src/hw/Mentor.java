package hw;

public class Mentor {
    String nameOfPerson;
    int ageOfPerson;
    String genderOfPerson;
    String level;

    public Mentor(String name, int age, String gender, String level) {
        nameOfPerson = name;
        ageOfPerson = age;
        genderOfPerson = gender;
        this.level = level;
    }
    public Mentor() {
        nameOfPerson = "Jane Doe";
        ageOfPerson = 30;
        genderOfPerson = "female";
        this.level = "intermediate";
    }
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers");
    }
    public void introduce() {
        System.out.println("Hi, I'm " + nameOfPerson + ", a " + ageOfPerson + " year old " + genderOfPerson + " "
                + level + " mentor.");
    }
}
