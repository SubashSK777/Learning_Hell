public class recuriveva {
  public static void main(String[] args) {
    NattyNum(15);
    
  }
  public static int NattyNum(int n) {
    if (n == 1) {
      System.out.println(1);
    } else {
      System.out.println(n);
      NattyNum( n - 1);

    }
  }
}
