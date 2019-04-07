import java.util.Scanner;

public class drawDiagonal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int numberOfLines = scanner.nextInt();

        for (int rows = 0; rows <= numberOfLines; rows++) {
            for (int columns = 0; columns <= numberOfLines; columns++) {
                if (rows == 0 || columns == 0 || rows == numberOfLines || columns == numberOfLines || rows == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was