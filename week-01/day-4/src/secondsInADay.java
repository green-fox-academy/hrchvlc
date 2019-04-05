public class secondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInHours = 0;
        int secondsInMinutes = 0;

        secondsInHours = currentHours * 60 * 60;
        secondsInMinutes = currentMinutes * 60;

        System.out.println(currentSeconds + secondsInHours + secondsInMinutes);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
    }
}