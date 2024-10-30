package HackerRank;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.println(N+" x " +i +" = "+ result);
  
        } 
        scanner.close();
    }
    
}
