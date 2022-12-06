package labs.Q1.Lab7;
import java.util.Scanner;

public class resort {
    	// main method 
	public static void main(String[] args) {
		// scanner instantiation
		Scanner scan = new Scanner(System.in);
		System.out.print("Temperature: ");
		int temp = scan.nextInt();
		scan.close();
        
		// set of conditionals that dictate what to print depending on user input.
		if (temp > 95) {
			System.out.print("Visit our shops!");
		}
		else if (temp >= 80) {
			System.out.print("swimming");
		}
		else if (temp >= 60) {
			System.out.print("tennis");
		}
		else if (temp >= 40) {
			System.out.print("golf");
		}
		else if (temp >= 20) {
			System.out.print("skiing");
		}
		// else if is not required as any other value read in would have to be under 20 
		else {
			System.out.print("Visit our shops!");
		}
	}
}