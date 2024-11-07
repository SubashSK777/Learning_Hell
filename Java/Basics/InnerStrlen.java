import java.util.*;

public class InnerStrlen {
public static void main(String[] args) {
    Strlen.getLength("syryfyutftiv");
}
    
    public class Strlen {
        public static int getLength(String input) {
            return input.length();
        }
    }
}