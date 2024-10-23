import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int fibo = scanner.nextInt();

    while(fibo < 0){
        System.out.println("Enter a Non-Negative Number");
        fibo = scanner.nextInt();
    }
     

    int first = 0;

    int second = 1;

    for(int i = 0; i < fibo; i++){
        System.out.println(first+" ");
        int next = first + second;

        first = second;

        second = next;

            

        }
        scanner.close();
    }     
}
