import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        // Number of inputs to read
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();       // Read the string input
            int x = scanner.nextInt();         // Read the integer input

            // Print formatted output
            System.out.printf("%-15s%03d%n", s1, x); // Left justify string in 15 chars and pad integer to 3 digits
        }

        System.out.println("================================");
        scanner.close(); // Close the scanner
    }
}
