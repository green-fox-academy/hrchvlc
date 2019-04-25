import java.util.Scanner;

public class drawPyramid {
    // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number:");
        int maxAmountOfStars = myScanner.nextInt();
        int something = 0;

        for (int i = 0; i < maxAmountOfStars; i++) {
            for (int j = maxAmountOfStars; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + something + 1; j++) {
                System.out.print("*");
            }
            something++;
            System.out.println();
        }
    }
}
