package hw;

import java.util.ArrayList;

public class Cohort {
    String nameOfCohort;
    ArrayList<String> listOfStudents;
    ArrayList<String> listOfMentors;

    public Cohort(String name) {
        nameOfCohort = name;
    }

    public void addStudent(String student) {
        listOfStudents.add(student);
    }
    public void addMentor(String mentor) {
        listOfMentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + nameOfCohort + " cohort has " + listOfStudents.size() + " students and "
        + listOfMentors.size() + " mentors.");
    }
}
