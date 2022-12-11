package labs.Q2.Lab10;

import java.util.Scanner;

public class wordRepetition {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount words you would like to see repeat:\n");
        int wordNum = s.nextInt();
        int j = 1;

        while (j <= wordNum){
            System.out.print("Enter a string: ");
            String input = s.next();

            for (int i = 1; i <= input.length(); i++){
                System.out.println(input.substring(0, i));
            }
            j++;  
        }
        s.close();
    }
}