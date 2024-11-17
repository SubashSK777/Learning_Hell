import java.util.*;

class Wallet {
    private int balance;
    private List<Integer> transactionLog;
    private List<Integer> snapshotHistory;

    public Wallet(int initialBalance) {
        this.balance = initialBalance;
        this.transactionLog = new ArrayList<>();
        this.snapshotHistory = new ArrayList<>();
        this.snapshotHistory.add(initialBalance); // Save the initial state as the first snapshot
    }

    public void showBalance() {
        System.out.println(balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactionLog.add(amount);
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            transactionLog.add(-amount);
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void reverseTransaction(int transactionIndex) {
        if (transactionIndex > 0 && transactionIndex <= transactionLog.size()) {
            int transactionValue = transactionLog.get(transactionIndex - 1);
            balance -= transactionValue; // Revert the effect on balance
            transactionLog.set(transactionIndex - 1, 0); // Mark as reversed
        } else {
            System.out.println("Invalid transaction index.");
        }
    }

    public void restoreSnapshot(int snapshotIndex) {
        if (snapshotIndex >= 0 && snapshotIndex < snapshotHistory.size()) {
            balance = snapshotHistory.get(snapshotIndex);
            transactionLog.clear(); // Clear transactions after rollback
            snapshotHistory.subList(snapshotIndex + 1, snapshotHistory.size()).clear(); // Remove future snapshots
        } else {
            System.out.println("Invalid snapshot index.");
        }
    }

    public void saveSnapshot() {
        snapshotHistory.add(balance);
        transactionLog.clear();
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the initial balance:");
            int startingAmount = scanner.nextInt();
            if (startingAmount < 0) {
                System.out.println("Initial balance cannot be negative.");
                return;
            }

            Wallet userWallet = new Wallet(startingAmount);

            System.out.println("Enter the number of operations:");
            int operationCount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (operationCount < 0) {
                System.out.println("Operation count cannot be negative.");
                return;
            }

            System.out.println("Enter operations (e.g., deposit 500):");
            for (int i = 0; i < operationCount; i++) {
                String input = scanner.nextLine();
                String[] commandParts = input.split(" ");
                String command = commandParts[0];

                switch (command) {
                    case "show":
                        userWallet.showBalance();
                        break;
                    case "deposit":
                        int depositValue = Integer.parseInt(commandParts[1]);
                        userWallet.deposit(depositValue);
                        break;
                    case "withdraw":
                        int withdrawValue = Integer.parseInt(commandParts[1]);
                        userWallet.withdraw(withdrawValue);
                        break;
                    case "reverse":
                        int transactionToReverse = Integer.parseInt(commandParts[1]);
                        userWallet.reverseTransaction(transactionToReverse);
                        break;
                    case "restore":
                        int snapshotToRestore = Integer.parseInt(commandParts[1]);
                        userWallet.restoreSnapshot(snapshotToRestore);
                        break;
                    case "snapshot":
                        userWallet.saveSnapshot();
                        break;
                    default:
                        System.out.println("Invalid command: " + command);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Please follow the correct input format.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in command. Ensure inputs are numbers where expected.");
        } finally {
            scanner.close();
        }
    }
}






















