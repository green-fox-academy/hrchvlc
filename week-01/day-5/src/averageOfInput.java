import java.util.Scanner;

public class averageOfInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int first;
        int second;
        int third;
        int fourth;
        int fifth;

        System.out.println("Gimme five integers: (after each number press enter)");
        first = myScanner.nextInt();
        second = myScanner.nextInt();
        third = myScanner.nextInt();
        fourth = myScanner.nextInt();
        fifth = myScanner.nextInt();

        int sum = first + second + third + fourth + fifth;
        double average = sum / 5;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}

// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4