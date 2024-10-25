import java.util.Scanner;

public class Hybrid {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Gender (Male/Female): ");

        String gender = scanner.nextLine();

        boolean isMale;

        if (gender.equalsIgnoreCase("Male")) {
            isMale = true;
        } else if (gender.equalsIgnoreCase("Female")) {
            isMale = false;
        } else {
            System.out.println("LGBTQ not Allowed");
            return;
        }

        System.out.println("Enter you Age");

        int age = scanner.nextInt();

        if (age < 25 && isMale) {

            System.out.println("Grow and Become Strong");

        } else if (age < 25 && !isMale) {

            System.out.println("Go Learn Cooking");
        } else if (age > 25 && isMale) {
            System.out.println("Live Long Bruh !!");
        } else {
            System.out.println("Go to Kitchen and Cook");
        }
        scanner.close();
    }

}
