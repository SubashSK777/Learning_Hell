public class GCD {
    public static void main(String[] args) {
        gcd(3697, 530)
    }

    public static int gcd (int a, int b){
        while(b != 0){
           int temp = b;
           b = a % b;
           a = temp; 
        }
        return a;
    }
}
