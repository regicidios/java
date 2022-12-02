package labs.Q1.Lab6;
import java.util.Scanner;

public class Lab6 {
    // Main method
    public static void main(String[] args) {
        // Variable declarations
        double num1 = Math.random();
        double num2 = 300 * Math.random() + 100;
        int num3 = (int)(38 * Math.random() -40);
        int num4 = (int)(50 * Math.random());

        // Outputs
        System.out.println("num1’s value is: " + num1);
        System.out.println("num2's value is: " + num2);
        System.out.println("num3's value is: " + num3);
        System.out.println("num4's value is: " + num4);

        // Value reassignment
        num4 = 5;
        num2 = 156.5;

        // New variable declarations
        int absnum3 = Math.abs(num3);
        int num5 = (int)Math.pow(num4, 3);
        int cbrtnum2 = (int)Math.cbrt(num2);

        // Outputs
        System.out.println("num3’s absolute value is: " + absnum3);
        System.out.println("num4 raised to the 3rd power is: " + num5);
        System.out.println("the cube root of num2 is: " + cbrtnum2);

        // Reading in user input
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        scan.close();

        // Distance formula sqrt((x1 - x2)^2 + (y1 - y2)^2)
        double distFormula = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));

        // Output
        String finalOutput = String.format("The distance between (%s,%s) and (%s, %s) is: %s", 
                                            x1, y1, 
                                            x2, y2, 
                                            distFormula);
        System.out.println(finalOutput);
    }
}
