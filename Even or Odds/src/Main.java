import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numInput = new Scanner(System.in);
        int numInputAct = numInput.nextInt() % 2;
        if (numInputAct == 1){System.out.println("Odd");}
            else {System.out.println("Even");}

    }
}