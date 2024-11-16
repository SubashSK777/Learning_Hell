#include <bits/stdc++.h>
using namespace std;

int main() {
    int balance, numOperations, currentCommit = 0;
    cin >> balance >> numOperations;
    vector<int> transactions;
    vector<int> commitStates = {balance};

    for (int i = 0; i < numOperations; i++) {
        string subash;
        cin >> subash;
        
        if (subash == "read") {
            cout << commitStates[currentCommit] << endl;
        } 
        else if (subash == "credit" || subash == "debit") {
            int amount;
            cin >> amount;
            if (subash == "credit") 
                commitStates[currentCommit] += amount;
            else 
                commitStates[currentCommit] -= amount;

            transactions.push_back(subash == "credit" ? amount : -amount);
        } 
        else if (subash == "abort") {
            int index;
            cin >> index;
            if (index > 0 && static_cast<size_t>(index) <= transactions.size()) {
                commitStates[currentCommit] -= transactions[index - 1];
                transactions[index - 1] = 0;
            }
        } 
        else if (subash == "rollback") {
            int commitIndex;
            cin >> commitIndex;
            if (commitIndex > 0 && commitIndex <= static_cast<int>(commitStates.size())) {
                currentCommit = commitIndex - 1;
                commitStates.resize(currentCommit + 1);
            }
        } 
        else if (subash == "commit") {
            commitStates.push_back(commitStates[currentCommit]);
            currentCommit++;
        }
    }
    return 0;
}
