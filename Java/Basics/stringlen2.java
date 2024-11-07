import java.util.Scanner;

public class stringlen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        System.out.println(length);
        sc.close();
    }
}
