public class Rando {
    public static void main(String[] args) {
        int i = 0;
        while(i < 100){
            i++;
            int num = (int)(Math.random()*100);
            System.out.println(i+ ". "+ num);
        }
    }
}
