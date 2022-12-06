package labs.Q1.Lab7;
import java.util.Scanner;
import java.text.NumberFormat;

public class computeAccStatement {
    // main method
	public static void main(String[] args) {
		System.out.println("CS International Statement");
		System.out.println("===============================\n");
		System.out.print("Previous Balance:   $");
		// scanner instantiation, reads in balance/additional charges as number input	
		Scanner scan = new Scanner(System.in);
		double balance = scan.nextDouble();
		System.out.print("Additional Charges: $");
		double addCharges = scan.nextDouble();
		scan.close();
		
		// interest/newBalance declarations, where they are used in a variety of conditionals to calculate interest.
		double newBalance = balance + addCharges;
		double interest = 0;
		if (newBalance > 0) {
			interest = newBalance * 0.02;
		}
		newBalance += interest;
		
		double minPay = 0;
		if (newBalance < 50) {
			minPay = newBalance;
		}
		else if (newBalance <= 300) {
			minPay = 50; 	
		}
		else {
			minPay = newBalance * 0.2; 
		}
		// utilization of currency number format to print out final values for interest, newBalance and minPay
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("Interest:           "+money.format(interest));
		System.out.println();
		System.out.println("New Balance:        "+money.format(newBalance));
		System.out.println();
		System.out.println("Minimum Payment:    "+money.format(minPay));
	}
}