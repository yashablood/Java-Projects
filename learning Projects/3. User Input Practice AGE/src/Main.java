import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name:");
        String firstName = scanner.next();

        System.out.print("Age:");
        int age = scanner.nextInt();
        int ageX2 = age*2;
        int numNameLetters = firstName.length();

        System.out.print("Amount of money in your pocket: $");
        double money = scanner.nextDouble();
        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName );
        System.out.println("You've lived " + age + " years. \n" + "In another "+ age + " years you will be " + ageX2 + " years old");
        System.out.format("You have $%.2f on you and need $%.2f.\n", money, moneyNeeded);
        System.out.print("You have " + numNameLetters + " letters in your name.");

        }
    }