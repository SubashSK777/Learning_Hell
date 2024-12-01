public class recuriveva {
  public static void main(String[] args) {
    NattyNum(1);
    System.out.println();
    NattyNum(12);
    
  }
  public static void NattyNum(int n) {
    if (n == 15) {
      System.out.print(15);
    } else {
      System.out.print(n + " ");
      NattyNum( n + 1);

    }
  }
}
