public class FiaalREcurva {

  public static int Recur(int current, int end) {

    if (current == end) {
      return current;
    } else {
      int current = current + Recur( current + 1, end);
      
    }
  }





  
  public static void main(String[] args) {
    Recur(1, 15);
  }
}
