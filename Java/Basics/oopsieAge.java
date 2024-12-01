public class oopsieAge {
  public static void main(String[] args) {
    AgeChecker(20);
    AgeChecker(0);
  }
  
  public static void AgeChecker (int age) {
    if (age < 18) {
      System.out.println("Get Lost Kid !!");
    } else {
      System.out.println("Enjoy Your Drinks Man !!!");
    }
  }
}
