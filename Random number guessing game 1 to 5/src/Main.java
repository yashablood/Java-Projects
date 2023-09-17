import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        Scanner keyboard = new Scanner(System.in);
        int answer;

            do {System.out.println("Guess a number:");
                answer = keyboard.nextInt();
               if (answer != randomNumber){
                   System.out.println(answer + "?");
                   System.out.println("Nope. Try again.");}
               }

            while (answer != randomNumber);

            System.out.println( "Correct!");
    }
}