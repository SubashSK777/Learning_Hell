#include <stdio.h>

int main()
{
    int num;
    printf("Enter a Number: ");
    scanf("%d", &num);
    if (num % 2 == 0){
        printf("It is Even");
    } else if (num == 0) {
       printf("It is Zero");
    } else {
        printf("It is Odd");
    }
    return 0;
}