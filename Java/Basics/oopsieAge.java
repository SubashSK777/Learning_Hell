public class oopsieAge {
  public static void main(String[] args) {
    AgeChecker(17);
    AgeChecker(18);
    AgeChecker(19);
  }
  
  public static String AgeChecker (int age) {
    if (age <= 18) {
      return "Get Lost Kid !!";
    } else {
      return "Enjoy Your Drinks Man !!!";
    }
  }
}
