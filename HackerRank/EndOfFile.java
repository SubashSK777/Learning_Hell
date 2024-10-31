import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(i+" " +line);
            i++;  
        }
        sc.close();  
    }
}