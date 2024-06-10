import java.util.Scanner;
import java.util.Random;
class Game{
    int userNumber;
    int computerNumber;
    int count=0;
      public Game()
      {
          System.out.println("computer has chosen its number");
          Random r=new Random();
          computerNumber=r.nextInt(100);
      }
      public void takeUserInput()
      {
          System.out.println("enter user's choice ");
          Scanner sc=new Scanner(System.in);
          userNumber=sc.nextInt();
      }
      public boolean isCorrectNumber()
      {
          if(userNumber<computerNumber)
          {
              System.out.println("please chose a greater number");
              count++;
              return false;
              
          }
          else if(userNumber>computerNumber)
          {
              System.out.println("please chose a smaller number");
              count++;
              return false;
          }
          else
          {
              System.out.println("you have guessed the correct number");
              System.out.println("computer has chosen "+computerNumber);
              return true;
          }
      }
      public int noOfguesses()
      {
          return count;
      }
}
public class Number_guessing_game{
    public static void main(String[] args) {
           Game g=new Game();
           boolean value=false;
           while(!value) {
               g.takeUserInput();
               value=g.isCorrectNumber();
           }
           System.out.println("your total number of guesses to find the correct number is "+g.noOfguesses());
    }
}
