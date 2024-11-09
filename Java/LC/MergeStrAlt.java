class Append {
    public static void mergeAlternately(String word1, String word2) {
        String word1;
        String word2;
        for (int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++){
            char c = i < word1.length() ? word1.charAt(i) : ' ';
            char d = j < word2.length() ? word2.charAt(j) : ' ';

        }

    }
}

public class MergeStrAlt{
    public static void main(String[] args) {
        Append.mergeAlternately("Subash", "Kumar");
    }
}