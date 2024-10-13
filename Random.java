import java.util.Scanner;
import java.util.Random;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;

        int attempts = 0;
        int guess = 0;

        while(guess != randomNumber){
            System.out.println("Enter your Guess: ");
            guess = scanner.nextInt();
            

        }

    }
}
