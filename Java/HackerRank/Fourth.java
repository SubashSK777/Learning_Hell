import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String Str = scanner.nextLine();

        System.out.println("String: " + Str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);

        scanner.close();

    }

}
