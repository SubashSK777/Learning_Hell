public class BigE {
    public static void main(String[] args) {
        String X = match("John", "Randy", "Shemus", "Big").toUpperCase();
        String Y = "Upcoming Match: " +match2("Mark", "Sean", "Dunkrick", "Diablo").toUpperCase();
        System.out.println(X);
        System.out.println(Y);

    }
    public static String match(String Pla1, String Pla2, String Pla3, String Pla4){
        String mat = (Pla1+ " & " +Pla2 + " vs " +Pla3 +" & "+ Pla4);
        return mat;
    }
    public static String match2(String Pla5, String Pla6, String Pla7, String Pla8){
        String mat = (Pla5+ " & " +Pla6 + " vs " +Pla7 +" & "+ Pla8);
        return mat;
    }
}