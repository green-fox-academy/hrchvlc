public class codingHours {
    public static void main(String[] args) {

        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int daily = 6; //hours a day
        int semester = 17; //weeks
        int workingDays = (semester * 7) - (semester * 2);
        System.out.println("The amount of working days: " + workingDays);
        System.out.println("The amount of hours spent coding: " + (daily * workingDays));

        int average = 52; //hours weekly

        System.out.println((30f / average) * 100 + "% in average weekly");

    }
}
