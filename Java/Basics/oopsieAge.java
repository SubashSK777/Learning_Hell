public class oopsieAge {
  public static void main(String[] args) {
    AgeChecker(17);
    AgeChecker(18);
    AgeChecker(19);
  }
  public static void AgeChecker (int age) {
    if (age <= 18) {
      System.out.println("Get Lost Kid !!");
    } else {
      System.out.println("Enjoy Your Drinks Man !!!");
    }
  }
}