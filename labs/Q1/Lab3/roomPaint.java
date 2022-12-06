package labs.Q1.Lab3;
import java.util.Scanner;

public class roomPaint {
    public static void main(String[] args) {
        //Variable declaration
        int COVERAGE = 350;
        double totalSqFt = 0, paintNeeded = 0, perimeter = 0;
    
        //Scanner creation, declaration of int variables whose value will equate the integers read in
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the length of the room");
        int l = s.nextInt();
        System.out.println("Please enter the width of the room");
        int w = s.nextInt();
        System.out.println("Please enter the height of the room");
        int h = s.nextInt();
        System.out.println("Please enter the numbers of doors");
        int d = s.nextInt();
        System.out.println("Please enter the numbers of windows");
        int win = s.nextInt();
        s.close();

        //Further variable declaration that pairs the amount of windows/doors with the value of windows/doors.
        int dval = d*20;
        int winval = win*15;

        //Printed length, width, and height of the room with their indivudal labels
        System.out.println("\nThe length of the room is: "+l+"\n");
        System.out.println("The height of the room is: "+h+"\n");
        System.out.println("The width of the room is: "+w+"\n");
        
        //Computation of the perimeter/total square feet/paint needed
        perimeter = 2*(l+w);
        totalSqFt = (perimeter*h)-(dval+winval);
        paintNeeded = totalSqFt/COVERAGE;
        
        //Conditional statement in the case that the l/w/h values read in all are equal to 0.
        if (l==0&&w==0&&h==0){
            System.out.println("There are no values to calculate perimeter with.\n");
        }

        //Printed amount of square feet to be painted
        System.out.println("The total square feet to be painted is: "+perimeter*h+"\n");

        //Conditional statement in the case that the total square feet of the room is smaller than the total square feet any doors/windows take up.
        if ((dval+winval)>perimeter*h) {
            System.out.println("There is no space to paint as it is completely occupied by doors/windows.\n");
        }

        System.out.println("The total gallons of paint needed is: "+paintNeeded+"\n");
    }
}
