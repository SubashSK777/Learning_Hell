
import java.util.Scanner;

public class A_Multiplication_Table{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        if (m == 1) {
            System.out.println(1);
        } else{
            for (int i = 1; i <= (int) Math.sqrt(n); i++){
                for (int j = 1; j <= (int) Math.sqrt(n); j++ ){
                    if (i * j == m) {
                        count = count + 2;
                    } 
                }
            }
            System.out.println(count);
        }
    }
}
