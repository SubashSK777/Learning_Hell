public class RevDig{
    public static void main(String[] args) {
        Reverse(55389);
    }
    public static void Reverse(int n){
        int revDigit = 0;
        while(n > 0){
            int lastDigit = n % 10;
            revDigit = revDigit * 10 + lastDigit;
        }
        System.out.println(revDigit);
    }   
}