package hw;

public class Person {
    String nameOfPerson;
    int ageOfPerson;
    String genderOfPerson;

    public Person(String name, int age, String gender) {
        nameOfPerson = name;
        ageOfPerson = age;
        genderOfPerson = gender;
    }
    public Person() {
        nameOfPerson = "Jane Doe";
        ageOfPerson = 30;
        genderOfPerson = "female";
    }


    public void introduce() {
        System.out.println("Hi, I'm " + nameOfPerson + ", a " + ageOfPerson + "year old " + genderOfPerson);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
