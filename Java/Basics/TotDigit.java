public class TotDigit {
    public static void main(String[] args) {
        tots(9479487);
    }
    public static  void tots(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count += 1;
        }
        System.out.println(count);
    }
}
