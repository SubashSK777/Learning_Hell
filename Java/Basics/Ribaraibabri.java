public class Ribaraibabri {

  public static int NumPrinter (int current, int end) {
    return current == end ? current : current + NumPrinter(current + 1, end) ;
  }

  public static void main (String [] args) {
    System.out.println(NumPrinter(1, 15));
  }
}
