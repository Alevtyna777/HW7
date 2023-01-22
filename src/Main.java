import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner (System.in);
        int secretNumber = random.nextInt(10);
        int counter = 0;
        boolean isRunning = true;

        while (isRunning) ; {
            System.out.println("Type your number:");
            int number = scanner.nextInt();
            if (number == secretNumber) ;
            {
                System.out.println("WIn!");
                isRunning = false;
            }
            counter ++ ;
            isRunning = counter >= 3 ;
        }
        System.out.println("Lose number " + secretNumber);
    }
}