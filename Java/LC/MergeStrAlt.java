import java.util.Scanner;

public class MergeStrAlt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word
        for (int i = 0, j = 0; i < word1.length() || j < word2.length(); i++, j++){
            char c = i < word1.length() ? word1.charAt(i) : ' ';
            char d = j < word2.length() ? word2.charAt(j) : ' ';
            System.out.print(c + " " + d + " ");
        }
    }
}

