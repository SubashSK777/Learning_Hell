import java.util.Arrays;

public class sortrring {
  public static void main (String [] args) {
    char[] lett = { 'h', 'u', 'w', 't', 'a', 'k', 'l', 'v'};

    int length = lett.length;
    Arrays.sort(lett);

    for (char you : lett) {
      System.out.println(you);
    }
  }
}