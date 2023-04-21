import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    int numList[] = new int[num];

    for(int i = 0; i < num; i++){
      numList[i] = in.nextInt();
    }

    int count = 0;
    int indivCount = -1;
    Integer highestNum = null; 
    
    for(int i: numList){
      for(int j: numList){
        if(i == j){
          indivCount++;
        }
       }
      if(indivCount > count){
          count = indivCount;
          highestNum = i;
        
      }
    }
    System.out.println(highestNum);
  
  }
}
