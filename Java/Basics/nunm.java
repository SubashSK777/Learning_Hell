import java.util.Scanner;

public class nunm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter a Number: ");

    int i = 0;

    while(i <= n) {
      i += 2;
      System.out.println(i);

    }
  }
  
}
