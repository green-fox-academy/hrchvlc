import java.util.Scanner;

public class partyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello, give me the number of girls:");
        int girls = scanner.nextInt();
        System.out.println("And now give me the number of boys:");
        int boys = scanner.nextInt();
        System.out.println("The party is excellent!");
        if ((boys == girls) & (girls + boys >= 20)) {
            System.out.println("Quite cool party!");
        } else if ((girls + boys >= 20) & (boys != girls)) {
            System.out.println("Average party...");
        } else if (girls == 0) {
            System.out.println("Sausage party");
        }

    }
}

// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is excellent!
// If the the number of girls and boys are equal and 20 or more people are coming to the party
//
// It should print: Quite cool party!
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people