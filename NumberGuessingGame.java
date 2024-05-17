import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int maxAttempts = 5; // Define the maximum number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
            }
        }

        scanner.close();
    }
}
