import java.util.Scanner;

public class drawTriangle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number!");
        int number = scanner.nextInt();
        String star = "*";

        String line = "";

      for (int numberOfLine = 1; numberOfLine <= number; numberOfLine ++) {
          for (int a = 1; a <= numberOfLine; a++) {
              System.out.print(star);
                      
          }
          System.out.println();
      }


       /*for (int i = 0; i < number; i++) {
            for (int j = 0; j < numberOfLine ; j++) {
                line += star;
                System.out.println(line);
            }
        }


        //numberOfLine++;


        */
    }
}


// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was