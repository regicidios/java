package labs.Q2.Lab9;
import java.util.Scanner;

public class Lab9b {
    public static void main(String[] args) {

        int randNum =(int)(Math.random() * 10 + 1);
        Scanner inputNum = new Scanner(System.in);
        int userNum;
        int highCount = 0, lowCount = 0;
        
        do{
            System.out.print("Enter a number from 1 to 10: ");
            userNum = inputNum.nextInt();

            if (randNum > userNum){
                System.out.println("Your number is lower than the correct number.\n");
                lowCount++;
            }
            else if (randNum < userNum){
                System.out.println("Your number is greater than the correct number.\n");
                highCount++;
            }
        }while (randNum != userNum);

        // Output
        System.out.println("You guessed the number correctly!");
        System.out.println("Number of guesses that were too low: "+lowCount); 
        System.out.println("Number of guesses that were too high: "+highCount);
        System.out.println("Total number of guesses: " +(highCount+lowCount+1));
    }
}
