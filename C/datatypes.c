#include <stdio.h>

int main() {
  int item;
  printf("Enter the Number of Items: ");
  scanf("%d", &item);
  float cost_of_item;
  printf("Enter the Cost of the Item: ");
  scanf("%f", &cost_of_item);
  float tots_cost = item * cost_of_item;

  printf("You have brought %d Items for the Cost of $ %.2f per item, Total Cost is %.2f",item, cost_of_item, tots_cost);

  return 0;
}