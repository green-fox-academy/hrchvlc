import java.util.Scanner;

public class printBigger {
    // Write a program that asks for two numbers and prints the bigger one

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int first;
        int second;

        System.out.println("Gimme two numbers: (after each press enter)");
        first = myScanner.nextInt();
        second = myScanner.nextInt();

        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
