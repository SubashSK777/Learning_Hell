class Solution {
    public static void mergeAlternately(String word1, String word2) {
        for (int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++){
            char c = i < word1.length() ? word1.charAt(i) : ' ';
            char d = j < word2.length() ? word2.charAt(j) : ' ';
            System.out.print(c + " " + d + " ");
        }
    }
}

public class MergeStrAlt{
    public static void main(String[] args) {
        Solution.mergeAlternately("Subash", "Kumar");
    }
}


