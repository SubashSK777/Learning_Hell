#include <stdio.h>

int main(){
  int num;
  printf("Enter a Number: ");
  scanf("%d", &num);
  unsigned long long int beg = 1;
  int i = 1;
  while (i <= num) {
    beg *= i;
    i++; 
  }
  printf("%llu", beg);
  return 0;
}