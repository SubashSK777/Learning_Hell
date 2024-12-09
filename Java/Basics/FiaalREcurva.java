public class FiaalREcurva {

  public static int Recur(int current, int end) {

    System.out.println(current);
    if (current == end) {
      return current;

    } else {
      return 
    }current + Recur( current + 1, end);
  }
  
  public static void main(String[] args) {
    Recur(1, 15);
  }
}