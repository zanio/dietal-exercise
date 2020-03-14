
import java.security.*;

 public class Craps{
     private static final SecureRandom randomNumbers = new SecureRandom();

    //  Common roll and what they stand for:
     private static final int two = 2;
     private static final int seven = 7;
     private static final int eleven = 11;
     private static final int three = 3;
     private static final int twelve = 12;
     private static int x;

     private enum Status {
         CONTINUE,
         WON,
         LOST
     };

     

     public static void main(String[] args){
        Status gameStatus;
        int myPoint =0;
        int sumOfDice = rollDice();
        switch(sumOfDice){
            case eleven:
            case seven:
            gameStatus = Status.WON;
            System.out.println("You Won");
            break;
            case two:
            case three:
            case twelve:
            gameStatus = Status.LOST;
            System.out.println("You Lost");
            break;
            default:
            gameStatus = Status.CONTINUE;
            myPoint = sumOfDice;
            System.out.printf("Point is %d%n",myPoint);
            break;

        }

        while(gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            if(sumOfDice == myPoint){
                gameStatus = Status.WON;
            } else{
                if (sumOfDice == seven){
                    gameStatus = Status.LOST;
                }
            }
            if(gameStatus == Status.WON){
                System.out.println("Win");
            }
            else{
                System.out.println("Lost");
            }
        }

     }

     public static int rollDice(){
         int roll1 = 1+randomNumbers.nextInt(6);
         int roll2 = 1+randomNumbers.nextInt(6);

         int rollSum = roll1 + roll2;
         System.out.printf("Player rolled %d + %d = %d%n", roll1, roll2, rollSum);
         return rollSum;
     }
 }