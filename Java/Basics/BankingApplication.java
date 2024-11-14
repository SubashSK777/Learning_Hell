public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}