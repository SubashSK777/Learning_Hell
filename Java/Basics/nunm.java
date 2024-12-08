import java.util.Scanner;

public class nunm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int n = sc.nextInt();

    int i = 0;

    while(i <= n) {
      i += 2;
      System.out.println(i);

    }
  }
  
}
