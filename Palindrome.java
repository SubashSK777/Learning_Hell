import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Word or Sentence: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        input = input.replaceAll("[^a-z A-Z 0-9]", "");

        String reverseInput = new StringBuilder(input).reverse().toString();

        if (input.equals(reversedInput)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a Palindrome.");
        }

    }
}
