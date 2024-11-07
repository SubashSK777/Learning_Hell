import java.util.*;

public class Triarea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int result = l*b*h;
        System.out.printf("%.2f",(double)result);
        sc.close();
    }
}