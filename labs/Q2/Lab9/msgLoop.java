package labs.Q2.Lab9;
import java.util.Scanner;

public class msgLoop {
    public static void main(String[] args)
    {
       int times = 1; //variable to increment loop
       Scanner numScan = new Scanner(System.in);
       System.out.print("How many times should the message be printed?");
       int printNum = numScan.nextInt();
       numScan.close();
 
       int numSum = 0;
 
       while (times <= printNum){
          System.out.println(times+" I love Computer Science!!!!!");
          numSum += times;
          times++;
       }   
       
       String finalOutput = String.format("Printed this message %s times.  The sum of the numbers from 1 to %s is %d.", printNum, printNum, numSum);
       System.out.print(finalOutput);   
    }
 }
