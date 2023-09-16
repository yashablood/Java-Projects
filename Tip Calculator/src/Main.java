import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //inputs
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the bill total:");
        double billTotal = keyboard.nextDouble();

        System.out.println("Enter the number of people to split the check between:");
        int numOfPeople = keyboard.nextInt();

        double splitTotal = billTotal / numOfPeople;

        System.out.printf("Each person should pay %.2f dollars each.", splitTotal );



    }


}