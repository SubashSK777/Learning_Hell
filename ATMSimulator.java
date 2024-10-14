import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000;

        int choice = 0;

        while(choice !=4){

            System.out.println("ATM Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Your Balance is: $"+balance);
                    break;

                case 2:
                    System.out.println("Deposit Selected");
                    double deposit = 
                    break;

                case 3:
                    System.out.println("Withdraw Selected");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        }
    }
    
}
