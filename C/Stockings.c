int maxProfit(int* prices, int pricesSize) {
    int sell = 0;
    int smleft = prices[0];
    for (int i = 0; i < pricesSize; i++) {
        if (prices[i] < smleft) {
            smleft = prices[i];
        }
        int profit = prices[i] - smleft;
        if (profit > sell) {
            sell = profit;
        }
    }
    return sell;
}