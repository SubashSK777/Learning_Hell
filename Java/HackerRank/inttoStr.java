import java.util.*;

public class inttoStr {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 100 && n <= -100){
            @SuppressWarnings("unused")
            String s = Integer.toString(n);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
        sc.close();
    }
    
}
