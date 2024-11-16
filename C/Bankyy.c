#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    double balance;
    double transactionAmount; 
    int isCredit;
} Transaction;

typedef struct {
    double balance;
    Transaction* transactions;
    int transactionCount;
    int commitCount;
} Account;

Account* createAccount(double initialBalance) {
    Account* account = (Account*)malloc(sizeof(Account));
    account->balance = initialBalance;
    account->transactions = (Transaction*)malloc(50 * sizeof(Transaction)); 
    account->transactionCount = 0;
    account->commitCount = 0;
    return account;
}

void readBalance(Account* account) {
    printf("%.2f\n", account->balance);
}

void credit(Account* account, double amount) {
    account->transactions[account->transactionCount].transactionAmount = amount;
    account->transactions[account->transactionCount].isCredit = 1;
    account->balance += amount;
    account->transactionCount++;
}

void debit(Account* account, double amount) {
    account->transactions[account->transactionCount].transactionAmount = amount;
    account->transactions[account->transactionCount].isCredit = 0;
    account->balance -= amount;
    account->transactionCount++;
}

void abortTransaction(Account* account, int transactionIndex) {
    if (transactionIndex <= account->commitCount) {
        printf("Cannot abort transaction %d as it has already been committed.\n", transactionIndex);
        return;
    }
    if (transactionIndex > 0 && transactionIndex <= account->transactionCount) {
        Transaction t = account->transactions[transactionIndex - 1];
        if (t.isCredit) {
            account->balance -= t.transactionAmount; 
        } else {
            account->balance += t.transactionAmount; 
        }

        for (int i = transactionIndex - 1; i < account->transactionCount - 1; i++) {
            account->transactions[i] = account->transactions[i + 1];
        }
        account->transactionCount--;
    }
}

void commit(Account* account) {
    account->commitCount = account->transactionCount; 
}

void rollback(Account* account, int commitIndex) {
    if (commitIndex > account->commitCount) {
        printf("Invalid rollback index.\n");
        return;
    }

    double newBalance = account->balance;
    for (int i = 0; i < commitIndex; i++) {
        Transaction t = account->transactions[i];
        if (t.isCredit) {
            newBalance -= t.transactionAmount;
        } else {
            newBalance += t.transactionAmount;
        }
    }
    account->balance = newBalance;
}

void freeAccount(Account* account) {
    free(account->transactions);
    free(account);
}

int main() {
    double initialBalance;
    int N;


    scanf("%lf", &initialBalance);
    Account* myAccount = createAccount(initialBalance);

    scanf("%d", &N);
    for (int i = 0; i < N; i++) {
        char operation[10];
        scanf("%s", operation);

        if (strcmp(operation, "read") == 0) {
            readBalance(myAccount);
        } else if (strcmp(operation, "credit") == 0) {
            double amount;
            scanf("%lf", &amount);
            credit(myAccount, amount);
        } else if (strcmp(operation, "debit") == 0) {
            double amount;
            scanf("%lf", &amount);
            debit(myAccount, amount);
        } else if (strcmp(operation, "abort") == 0) {
            int transactionIndex;
            scanf("%d", &transactionIndex);
            abortTransaction(myAccount, transactionIndex);
        } else if (strcmp(operation, "commit") == 0) {
            commit(myAccount);
        } else if (strcmp(operation, "rollback") == 0) {
            int commitIndex;
            scanf("%d", &commitIndex);
            rollback(myAccount, commitIndex);
        }
    }

    freeAccount(myAccount);
    return 0;
}