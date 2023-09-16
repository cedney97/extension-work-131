package Batch1.Exam2Extension.SquareGuesser;

import java.util.Scanner;

public class SquareTraining {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int random = (int) (Math.random() * 1000000 + 1); // Generate random number 1 - 1,000,000
        double sqrt = Math.sqrt(random); // Get sqrt of random number
        int nextSquare = (int) Math.pow(Math.ceil(sqrt), 2); // Find next square of random number (ceil(sqrt)^2)
        System.out.print("Enter the first square greater than " + random + ": "); // Initial user input prompt
        int guess = in.nextInt();
        while (guess != nextSquare) {
            if (guess < random) { // Display error if guess is lower than random number
                System.out.println("You guessed lower than the random number silly!");
            }
            if (guess > 1000000) { // Display error if guess is higher than 1,000,000
                System.out.println("You guessed higher than 1,000,000 silly!");
            }
            System.out.print("Enter the first square greater than " + random + ": ");
            guess = in.nextInt();
        }
        int nextSqrt = (int) Math.sqrt(nextSquare); // Get sqrt of next square
        System.out.println("You got it, " + nextSquare + " is " + nextSqrt + " squared!"); // Print success message
        in.close();
    }
}