public class factRecurve {
  public static void main (String [] args) {
    recurve(5);
    int i = 0;
  }

  public static void recurve (int n) {
    if (i < n){
      System.out.println (n+ ". Hello World");
      recurve (i+1);
    }
  } 
}