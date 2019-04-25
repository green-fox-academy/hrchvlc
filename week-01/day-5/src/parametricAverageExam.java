import java.util.Scanner;

public class parametricAverageExam {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfNumbers;
        int sum = 0;
        double average = 0;
        System.out.println("Give me number of numbers");
        numberOfNumbers = myScanner.nextInt();

        for (int i = 0; i < numberOfNumbers; i++) {
            System.out.println("Gimme that integer!");
            int finallyNumber = myScanner.nextInt();
            sum += finallyNumber;
        }
        average = sum / numberOfNumbers;
        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4