import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Choose from  1 to 10. You have minimum 3 attempts");
        int secretNumber = random.nextInt(10);
        int counter = 0;
        boolean isRunning = true;

        while (isRunning)  {
            System.out.println("Type your number:");
            int number = scanner.nextInt();
            counter++;
            isRunning = counter >= 3 ;

            if (number == secretNumber) {
                System.out.println("WIn!");
                isRunning = false;
            } else if (secretNumber != number) {
                System.out.println("Lose number  = " + secretNumber);
            }
        }

        System.out.println(" Congrats! Game is over! ");
    }
}