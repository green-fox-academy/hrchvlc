import java.util.Scanner;

public class drawChessTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int numberOfLines = scanner.nextInt();

        for (int rows = 0; rows <= numberOfLines; rows++) {
            for (int columns = 0; columns <= numberOfLines; columns++) {
                if ((columns % 2 == 0) && (rows % 2 == 0)) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//