public class recuriveva {
  public static void main(String[] args) {
    NattyNum(1);
    
  }
  public static void NattyNum(int n) {
    if (n == 15) {
      System.out.println(15);
    } else {
      System.out.println(n);
      NattyNum( n + 1);

    }
  }
}
