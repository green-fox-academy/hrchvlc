import java.util.Scanner;

public class animalsAndLegs {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int numberOfChickens;
        int numberOfPigs;
        int chickenLegs = 2;
        int pigLegs = 2;

        System.out.println("Gimme a number of chickens:");
        numberOfChickens = myScanner.nextInt();
        System.out.println("Gimme a number of pigs:");
        numberOfPigs = myScanner.nextInt();
        System.out.println("All animals have " + (numberOfChickens * chickenLegs + numberOfPigs * pigLegs) + " legs.");

    }
}
