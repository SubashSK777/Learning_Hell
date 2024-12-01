public class Stringchar 
{
  public static void main (String [] args)
  {
    String Pranesh = "Malayalam";
    char [] Charades = Pranesh.toCharArray();
    System.out.println(Charades);
    int len = Charades.length;

    int first = 0;
    int last = len - 1;

    while (first < last)
    {
      if (Charades[first] != Charades[last])
      {
        System.out.println("It is not a Palindrome");
        return;
      }
      first++;
      last--;
    }
    System.out.println("It is a Palindrome");
  }
}