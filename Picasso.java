import java.util.Scanner;

public class Picasso {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Age: ");

        int age = scanner.nextInt();

        if(age < 30){
            for(int i = 1; i <= 25; i++){
                System.out.println(i+". I Love Java");  
            }
        } else{
            for(int j = 1; j <= 100; j+= 10){
                System.out.println(j+". I Hate Java");
            }
        }
        scanner.close();
    }
}
