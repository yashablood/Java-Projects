import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number.");
        int x = keyboard.nextInt();

        System.out.println("Enter another number.");
        int y = keyboard.nextInt();

        if (x > y) {System.out.println( x + " is bigger than " + y + ".");
            int diff = x - y;
                System.out.println("The Difference is " + diff + ".");}
        else if (x < y) {System.out.println( y + " is bigger than " + x + ".");
            int diff = y - x;
                System.out.println("The Difference is " + diff + ".");}
        else {System.out.println("Both numbers are equal at " + x + ".");}
    }
}