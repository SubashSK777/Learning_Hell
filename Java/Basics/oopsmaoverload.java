public class oopsmaoverload {
  public static void main(String[] args) {
    AddNum(20, 30);
    AddNum(3.54f, 2.91f); 
  }
  
  public static int AddNum (int a, int b) {
    int result = a + b;
    System.out.println("Sum of 2 Int is " + result);
    return result;
  }

  public static float AddNum (float a, float b) {
    float result = a + b;
    System.out.println("Sum of 2 Float is " + result);
    return result;
  }
}
