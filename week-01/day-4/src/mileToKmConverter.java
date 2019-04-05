import java.util.Scanner;

public class mileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

                Scanner scanner = new Scanner(System.in);

                double miles = 0.621371;
                System.out.println("Please, give us kilometers as integer:");
                int askKilos = scanner.nextInt();

                System.out.println("Your integer in miles: " + (askKilos * miles));

            }
}
