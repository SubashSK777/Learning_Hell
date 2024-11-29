public class VowelFinderEasy
{
  public static String removeVowels(String input)
  {
    String result;
    result = input.replaceAll("[aeiouAEIOU]", "");
    return result;
  }
  public static String removeConsonants(String input)
  {
    String result;
    result = input.replaceAll("[^aeiouAEIOU]", "");
    return result;
  }
  public static void main (String [] args)
  {
    String input = "Subash Kumar";

    String remVowels = removeVowels(input);
    System.out.println("Vowels Removed: " + remVowels);

    String RemConsonants = removeConsonants(input);
    System.out.println("Consonants Removed: " + RemConsonants);
  }
}