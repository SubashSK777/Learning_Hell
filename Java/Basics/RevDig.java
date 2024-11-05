public class RevDig{
    public static void main(String[] args) {
        Reverse(5);
    }
    public static void Reverse(int n){
        int revDigit = 0;
        while(n > 0){
            int lastDigit = n % 10;
            revDigit = revDigit * 10 + lastDigit;
        }
    }
}