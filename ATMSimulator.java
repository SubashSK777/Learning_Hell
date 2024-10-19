import java.util.Scanner;

class ATMSimulator {
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
                    System.out.println("Enter your Deposit Amount: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("You've Successfully Deposited $"+deposit);
                    System.out.println("Your New Balance is $"+balance);
                    break;

                case 3:
                    System.out.println("Withdraw Selected");
                    System.out.println("Enter Withdrawal Amount: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("You've Successfully Withdrawn $"+withdraw);
                        System.out.println("Your Current Balance is $"+balance); 
                    
                    } else {
                        System.out.println("Insufficient Balance. Unable to Withdraw.");
                    }    
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice. Please Try Again.");
            }
        }
        scanner.close();
    }
    
}