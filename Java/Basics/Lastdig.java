public class Lastdig {
    public static void main(String[] args) {
        last(3827);
    }
    public static void last(int n){
        n = n % 10;
        System.out.println(n);
    }
}
