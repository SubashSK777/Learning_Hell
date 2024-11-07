import java.util.*;

public class Strlen {

    public static int getLength(String input) {
        return input.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  
        int length = getLength(input); 
        System.out.println(length);
        sc.close();
    }
}
