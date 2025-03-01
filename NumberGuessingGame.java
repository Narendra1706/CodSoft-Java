import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            System.out.println("Select difficulty level:");
            System.out.println("1. Easy (12 attempts)");
            System.out.println("2. Medium (8 attempts)");
            System.out.println("3. Hard (5 attempts)");
            System.out.print("Enter your choice (1/2/3): ");
            int levelChoice = scanner.nextInt();
            int attemptsLeft;
            switch (levelChoice) {
                case 1:
                    attemptsLeft = 12;
                    break;
                case 2:
                    attemptsLeft = 8;
                    break;
                case 3:
                default:
                    attemptsLeft = 5;
                    break;
            }
            int numberToGuess = random.nextInt(100) + 1;
            boolean guessedCorrectly = false;
            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                    totalScore += attemptsLeft; // More attempts left = higher score
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you're out of attempts. The number was: " + numberToGuess);
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing! Your total score: " + totalScore);
        scanner.close();
    }
}