public class FiaalREcurva {

  public static int Recur(int current, int end) {

    if (current == end) {
      return current;
      System.out.println(current);
    } else {
      return current + Recur( current + 1, end);
      System.out.println(current);
    }
  }
  
  public static void main(String[] args) {
    Recur(1, 15);
  }
}
