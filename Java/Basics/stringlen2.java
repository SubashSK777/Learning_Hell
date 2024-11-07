import java.util.Scanner;

public class stringlen2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int length = word.length();
        System.out.println(length);
        sc.close();
    }
}