import java.util.*;

public class Paralleo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        sc.close();

        System.out.println((B > 0 && H > 0) ? B*H : "java.lang.Exception: Breadth and height must be positive");
    }
}