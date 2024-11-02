public class ReReReeema {
    public static void main(String[] args) {
        rem(1);
    }
    public static void rem(int n){
         if(n==11){
            System.out.println(1);
         }
         else{
            System.out.println(n);
            rem(n+1);
         }
    }
}
