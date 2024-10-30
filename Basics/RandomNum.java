import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            
            int randomNumber = random.nextInt(100)+1;
            
            int attempts = 0;
            int guess = 0;
            
            while(guess != randomNumber){
                System.out.println("Enter your Guess: ");
                guess = scanner.nextInt();
                attempts++;
                
                if(guess > randomNumber){
                    System.out.println("High !! Try Again.");
                } else if (guess < randomNumber){
                    System.out.println("Low !! Try Again.");
                } else {
                    System.out.println("Correct !! You Guessed it in "+attempts+" Attempts");
                }
            }
        }
    }
}
