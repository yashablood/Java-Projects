import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int hiddenNumber;
        int guess;
        boolean correct = true;
        Scanner guessInput = new Scanner(System.in);

        System.out.print("Select a secret number.");
        hiddenNumber = guessInput.nextInt();

        while (correct) {
            System.out.println("Time to guess.");
            guess = guessInput.nextInt();

            if (guess == hiddenNumber) {
                correct = true;
                System.out.println("Correct!");
            } else if (guess < hiddenNumber) {
                System.out.println("Try a higher number.");
            } else if (guess > hiddenNumber) {
                System.out.println("Try a lower number.");

            }
            }
        }

    }
