#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char key[50];
    double balance;
} Wallet;

Wallet* createWallet(const char* key, double initialBalance) {
    Wallet* wallet = (Wallet*)malloc(sizeof(Wallet));
    strcpy(wallet->key, key);
    wallet->balance = initialBalance;
    return wallet;
}

void deposit(Wallet* wallet, double amount) {
    wallet->balance += amount;
}

void withdraw(Wallet* wallet, double amount) {
    if (wallet->balance >= amount) {
        wallet->balance -= amount;
    } else {
        printf("Insufficient balance\n");
    }
}

double getBalance(Wallet* wallet) {
    return wallet->balance;
}

void freeWallet(Wallet* wallet) {
    free(wallet);
}

int main() {
    Wallet* myWallet = createWallet("myKey123", 100.0);
    deposit(myWallet, 50.0);
    printf("Current Balance: %.2f\n", getBalance(myWallet));
    withdraw(myWallet, 30.0);
    printf("Current Balance: %.2f\n", getBalance(myWallet));
    freeWallet(myWallet);
    return 0;
}