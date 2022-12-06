package labs.Q2.Lab9;
import java.util.Scanner;

public class factorialGuesser {
    public static void main(String[] args) {

        Scanner factScan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int factNum = factScan.nextInt();

        while (factNum < 0){
            System.out.print("Please enter a positive integer: ");
            factNum = factScan.nextInt();
        }    

        int factInput = factNum; 
        factScan.close();
        int factorial = 1;
        
        while (factNum > 0){
            factorial *= factNum;
            factNum--;
        }

        System.out.println(factInput+"! = "+factorial);
    }
}
