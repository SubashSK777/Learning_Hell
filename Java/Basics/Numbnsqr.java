public class Numbnsqr {
    public static void main(String[] args) {
        int n = 500;
        int i = 0;
        while (i <= n) {
            System.out.println("Number: "+i+" & the Sqr Root: "+i*i);
            i++;
        }
    }
}
// Time Complexity : O(n); cuz it grows with the int n;
// Space Complexity : O(1); cuz only 1 number is being processed at a time;