//not finished

import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number that you friend will guess!");
        int number = scanner.nextInt();

        System.out.println("Guess the number");
        int userGuess = scanner.nextInt();
        while (userGuess != number) {
            if (userGuess > number) {
                System.out.println("The stored number is lower");
            } else if (userGuess < number) {
                    System.out.println("The stored number is higher");
            }System.out.println();
        } System.out.println("You guessed it!");
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8