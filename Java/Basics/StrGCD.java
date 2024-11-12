public class StrGCD {
    public static void main(String[] args) {
        
    }
    public static String Solution(String str1, String str2){
        while(str2 != ""){
            String temp = str2;
            str2 = str1 % str2;
            str1 = temp;

        }

    }
}
