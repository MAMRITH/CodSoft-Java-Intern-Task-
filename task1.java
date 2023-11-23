package Task;
import java.util.*;
public class task1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int attemptsLimit = 10;
	        int rounds = 0;
	        int totalAttempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");

	        do {
	            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
	            int userGuess;
	            int attempts = 0;

	            System.out.println("\nRound " + (rounds + 1) + " - Guess the number between " + minRange + " and " + maxRange);

	            do {
	                System.out.print("Enter your guess: ");
	                userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == numberToGuess) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                } else if (userGuess < numberToGuess) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }

	            } while (userGuess != numberToGuess && attempts < attemptsLimit);

	            totalAttempts += attempts;
	            rounds++;

	            System.out.print("Do you want to play again? (yes/no): ");
	        } while (scanner.next().equalsIgnoreCase("yes"));

	        System.out.println("Thanks for playing! Your total score is based on the total attempts: " + totalAttempts);
	        scanner.close();
	    }
	}
