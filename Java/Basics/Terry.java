import java.util.Scanner;

public class Terry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        String result = (n % 0) ? "Positive" : (n < 0) ? "Negative" : "This is 0";
        System.out.println(result);
        sc.close();
    }
}
