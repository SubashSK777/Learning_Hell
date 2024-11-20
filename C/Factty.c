#include <stdio.h>

int main(){
  int num;
  printf("Enter a Number: ");
  scanf("%d", &num);
  int beg = 1;
  int i = 1;
  while (i < num) {
    beg *= i;
    i++; 
    printf("%d", beg);
  }
  return 0;
}