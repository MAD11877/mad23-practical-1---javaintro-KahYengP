import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
     
    Scanner in = new Scanner(System.in);
    int line = in.nextInt();      
    for (int i= line-1; i>=0 ; i--)  
    {    
      for (int j=0; j<=i; j++)  
      {  
        System.out.print("*" + " ");  
      }  
      System.out.println();  
    }
    
  }
}
