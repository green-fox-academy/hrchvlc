package hw;

public class Sponzor {
    String nameOfPerson;
    int ageOfPerson;
    String genderOfPerson;
    String companyName;
    int hiredStudents;

    public Sponzor(String name, int age, String gender, String company) {
        nameOfPerson = name;
        ageOfPerson = age;
        genderOfPerson = gender;
        companyName = company;
        hiredStudents = 0;
    }
    public Sponzor() {
        nameOfPerson = "Jane Doe";
        ageOfPerson = 30;
        genderOfPerson = "female";
        companyName = "Google";
        hiredStudents = 0;
    }


    public void introduce() {
        System.out.println("Hi, I'm " + nameOfPerson + ", a " + ageOfPerson + " year old " + genderOfPerson
        + " who represents " + companyName + " and hired " + hiredStudents + " students so far.");
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
    public void hire() {
        hiredStudents++;
    }
}
