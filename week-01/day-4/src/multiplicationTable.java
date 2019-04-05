import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


        System.out.println("Give me a number!");
        int a = scanner.nextInt();

        for (int x = 1; x <= 10; x ++) {
            int y = x * a;
            System.out.println(x + " * " + a + " = " + y);
        }

    }
}

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150