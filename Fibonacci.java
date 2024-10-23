import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fibo = scanner.nextInt();

        // Validate the input to ensure it's non-negative
        while(fibo < 0){
            System.out.println("Enter a Non-Negative Number");
            fibo = scanner.nextInt();
        }

        int first = 0;
        int second = 1;

        // Print the Fibonacci sequence up to the 'fibo' count
        for(int i = 0; i < fibo; i++){
            System.out.print(first + " ");  // Print on the same line
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();  // Close scanner
    }
}
