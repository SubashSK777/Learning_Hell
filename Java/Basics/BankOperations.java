import java.util.*;

class BankAccount {
    private int balance;
    private List<Integer> transactions;
    private List<Integer> commits;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        this.commits = new ArrayList<>();
        this.commits.add(initialBalance); // Initial state as the first commit
    }

    public void read() {
        System.out.println(balance);
    }

    public void credit(int amount) {
        transactions.add(amount);
        balance += amount;
    }

    public void debit(int amount) {
        transactions.add(-amount);
        balance -= amount;
    }

    public void abort(int transactionIndex) {
        if (transactionIndex <= transactions.size()) {
            int transactionValue = transactions.get(transactionIndex - 1);
            transactions.set(transactionIndex - 1, 0);
            balance -= transactionValue;
        }
    }

    public void rollback(int commitIndex) {
        if (commitIndex < commits.size()) {
            balance = commits.get(commitIndex);
            // Reapply all transactions after the rollback commit
            transactions.clear();
            for (int i = commitIndex + 1; i < commits.size(); i++) {
                commits.remove(i);
            }
        }
    }

    public void commit() {
        commits.add(balance);
        transactions.clear();
    }
}

public class BankOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialBalance = sc.nextInt();
        BankAccount account = new BankAccount(initialBalance);

        int operationsCount = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < operationsCount; i++) {
            String operation = sc.nextLine();
            String[] parts = operation.split(" ");
            String command = parts[0];

            switch (command) {
                case "read":
                    account.read();
                    break;
                case "credit":
                    int creditAmount = Integer.parseInt(parts[1]);
                    account.credit(creditAmount);
                    break;
                case "debit":
                    int debitAmount = Integer.parseInt(parts[1]);
                    account.debit(debitAmount);
                    break;
                case "abort":
                    int abortIndex = Integer.parseInt(parts[1]);
                    account.abort(abortIndex);
                    break;
                case "rollback":
                    int rollbackIndex = Integer.parseInt(parts[1]);
                    account.rollback(rollbackIndex);
                    break;
                case "commit":
                    account.commit();
                    break;
            }
        }

        sc.close();
    }
}
