import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second Number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        double result;

        switch(choice){
            case 1:
                result = num1 + num2;
                System.out.println("Result = "+result);

            case 2:
                result = num2 - num2;
                System.out.println("Result = "+result);

            case 3:
                result = num1 * num2;
                System.out.println("Result = "+result);

            case 4:
                
        }
    }
}
