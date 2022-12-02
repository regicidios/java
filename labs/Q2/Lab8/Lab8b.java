package labs.Q2.Lab8;
import java.util.Scanner;

public class Lab8b {
    public static void main(String[] args)
    {
	int month, day, year;   //date read in from user
	int daysInMonth;        //number of days in month read in 
	boolean monthValid = false, yearValid = false, dayValid = false, leapYear = false;  //true if input from user is valid, true if user's year is a leap year
	Scanner scan = new Scanner(System.in);

	//Get integer month, day, and year from user
	System.out.print("Enter the month: ");
	month = scan.nextInt();
	System.out.print("Enter the day: ");
	day = scan.nextInt();
	System.out.print("Enter the year: ");
	year = scan.nextInt();
	scan.close();

	//Check to see if month is valid, set monthValid accordingly
	if (month >= 1 && month <= 12 ){
		monthValid = true;
	}

	//Check to see if year is valid, set yearValid accordingly
	if (year >= 1000 && year <= 1999){
		yearValid = true;
	}

	//Determine whether it's a leap year, set leapYear accordingly
	if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
		leapYear = true;
	}

	//Set daysInMonth based on what month user entered. 
	if (month == 2){
		if (leapYear){
			daysInMonth = 29;
		}
		else {
			daysInMonth = 28;
		}
	}
	
	else if ((month % 2 == 0 && month >= 8) || (month % 2 == 1 && month < 8)){
		daysInMonth = 31;
	}

	else {
		
		daysInMonth = 30;
	}

	//Determine whether day entered is valid, based on value set in daysInMonth. 
	
	if (day <= daysInMonth && day > 0){
		dayValid = true;
	}

	//Determine whether ENTIRE date is valid and print appropriate message
	if (dayValid && monthValid && yearValid){
		System.out.print("Date is valid");
	
   //If date is valid only: Print if date is a leap year. DO NOT PRINT LEAP YEAR STATUS IF DATE IS INVALID
		if (leapYear){
			System.out.print(" , year is a leap year");
		}
	}

	else {
		System.out.print("Date is not valid");
		}
   
    }
}
