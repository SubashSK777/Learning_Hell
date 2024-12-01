public class aray2 
{
  public static void main(String[] args) 
  {
    int [] [] [] aray2d = {{{2, 4 },{6, 8, 0}}, {{3, 5 },{7, 9}}, {{1, 3},{ 5, 7, 8}}};

    for (int i = 0; i < aray2d.length; i++) 
    {
      for (int j = 0; j < aray2d[i].length; j++)
      {
        for (int k = 0; k < aray2d[i][j].length; k++)
        {
          System.out.print(aray2d[i][j][k]);
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}