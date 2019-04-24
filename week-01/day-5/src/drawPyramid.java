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

        /* for (int j = 0; j < size; j++) {
          //  for (int o = size; j < o; o--) {
          //      System.out.print(" ");
           // }
            for (int i = 0; i < j + 1; i++) {
                System.out.print("*");
            }
         //   something++;
            System.out.println();
        }

         */

     /*   for (int i = 0; i < maxAmountOfStars; i++) {
            printRowOfSpaces();
            printRowOfStars(i);
            System.out.println();
        }
    }

    public static void printRowOfStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }
    public static void printRowOfSpaces() {

    }

      */
    }
}
