// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[]args) {
        System.out.println("Gimme number!");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();
        takeNumber(scannerNumber);
    }

    public static void takeNumber (int returnedNumber) {
        try { returnedNumber = 10 / returnedNumber;
            System.out.println(returnedNumber);

        } catch(ArithmeticException e) {
            System.out.println("You cannot input zero!");
        }
    }
}
