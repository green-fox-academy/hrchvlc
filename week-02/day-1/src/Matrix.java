import java.util.Scanner;

public class Matrix {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int numberOfLines = scanner.nextInt();

        for (int rows = 0; rows <= numberOfLines; rows++) {
            for (int columns = 0; columns <= numberOfLines; columns++) {
                if (rows == columns) { //rows == 0 || columns == 0 || rows == numberOfLines || columns == numberOfLines ||
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}


// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output