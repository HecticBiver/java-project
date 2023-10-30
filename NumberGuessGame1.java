import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame1 {
     public static void main (String[] args){
      
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;
       // System.out.println("The Random Number Is " + randomNumber);
         int retryCounter = 0;
        while (true) {
            
System.out.println("Enter your Guess {1 - 100}:");
int playerGuess = scanner.nextInt();
        retryCounter++;
        
        if (playerGuess == randomNumber) {
            System.out.println("Correct Thats The Right Number");
            System.out.println("Number Of Retrys50: " + retryCounter + " Times");
            break;
        }
        else if(randomNumber > playerGuess) {
            System.out.println("Sorry But The Number Is Higher. Guess Again.");
        }
        else{
        System.out.println("Sorry But The Number Is Lower. Guess Again."); 

        }


        
    }


     scanner.close();
     }
}