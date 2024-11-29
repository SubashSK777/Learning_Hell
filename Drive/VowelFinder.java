public class VowelFinder
{
  public static String remVowels(String input)
  {
    StringBuilder result = new StringBuilder();
    for (char c : input.toCharArray())
    {
      if (!isVowel(c))
      {
        result.append(c);
      }
    }
    return result.toString();
  }

  public static String RemConsonants(String input)
  {
    StringBuilder result = new StringBuilder();
    for (char c : input.toCharArray())
    {
      if (isVowel(c))
      {
        result.append(c);
      }
    }
    return result.toString();
  }

  public static boolean isVowel(char c)
  {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
  }

  public static void main (String [] args)
  {
    String input = "Subash Kumar";

    String noVowel = remVowels (input);

    System.out.println("Vowels Removed: " + noVowel);

    String noConsonants = RemConsonants (input);

    System.out.println("Consonants Removed: " + noConsonants);
  }
}