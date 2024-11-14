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
            int startingAmount = scanner.nextInt();
            Wallet userWallet = new Wallet(startingAmount);

            int operationCount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            long startTime = System.nanoTime(); // Start timing in nanoseconds

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

            long endTime = System.nanoTime(); // End timing in nanoseconds
            long duration = endTime - startTime; // Calculate duration in nanoseconds

            // Convert duration to milliseconds for easier readability
            double durationInMillis = duration / 1_000_000.0;
            System.out.printf("Total execution time: %.3f milliseconds%n", durationInMillis);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
