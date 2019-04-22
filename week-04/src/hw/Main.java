package hw;

import java.util.ArrayList;

public class Main {
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();
    ArrayList<Sponzor> sponzors = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
people.add(mark);
    Person jane = new Person();
people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
students.add(john);
    Student student = new Student();
students.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
mentors.add(gandhi);
    Mentor mentor = new Mentor();
mentors.add(mentor);
    Sponzor sponzor = new Sponzor();
sponzors.add(sponzor);
    Sponzor elon = new Sponzor("Elon Musk", 46, "male", "SpaceX");
sponzors.add(elon);

student.skipDays(3);

for (int i = 0; i < 5; i++) {
        elon.hire();
    }

for (int i = 0; i < 3; i++) {
        sponzor.hire();
    }

for (Person person : people) {
        person.introduce();
        person.getGoal();
    }

for (Student person : students) {
        person.introduce();
        person.getGoal();
    }

for (Mentor person : mentors) {
        person.introduce();
        person.getGoal();
    }

for (Sponzor person : sponzors) {
        person.introduce();
        person.getGoal();
    }
}
