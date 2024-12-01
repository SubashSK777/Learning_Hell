public class Ribaraibabri {
  public static void main(String[] args) {
    
  }
  public static void shortre (int n) {
    int result = (n == 1) ? 1 : (n - 1) ? n + shortre(n - 1); : shortre(n);
  }
  
}
