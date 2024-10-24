import java.util.Scanner;

public class Hybrid {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Gender (Male/Female): ");

        String gender = scanner.nextLine();

        boolean isMale;

        if(gender.equalsIgnoreCase("Male")){
            isMale = true;
        } else if (gender.equalsIgnoreCase("Female")){
            isMale = false;
        }else {
            System.out.println("LGBTQ not Allowed");
            return;
        }
        
    }
    
}
