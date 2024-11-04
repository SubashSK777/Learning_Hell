public class OddEven{
    public static void main(String[] args) {
        eve(6);
    }
    public static void eve(int n){
        if(n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}