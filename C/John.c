#include <stdio.h>
#include <stdbool.h>

int main () {
  char name[] = "John Cena";
  int age = 40;
  float weight = 80.9;
  char my = 'C';
  bool stat = true;
  unsigned long int big = -129;

  // printf("I am %s and my Age is %d, guess what my weight is, it's only %f\n", name, age, weight);
  // printf("You can't %c meeeee.\n", my);
  // printf("Is John Cena Alive ??: %d", stat);
  printf("%lu", big);

  return 0;
}