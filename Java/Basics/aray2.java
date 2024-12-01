public class aray2 
{
  public static void main(String[] args) 
  {
    int [] [] aray2d = {{2, 4, 6, 8, 0}, {3, 5 ,7, 9}};

    for (int i = 0; i < aray2d.length; i++) 
    {
      for (int j = 0; j < aray2d[i].length; j++)
      {
        System.out.print(aray2d[i][j] + " ");
      }
      System.out.println();
    }
  }
}