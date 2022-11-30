/*
 * Write a program that prompts the user to enter the minutes, and displays the maximum number of years and remaining
 * days. Assume a year has 365 days.
 * 
 */


package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Enter number of days
		System.out.println("Enter a number of minutes (e.g. 1000000000): ");
		int userMinutes = input.nextInt();
		
		// Calculate max number of years
		// 1440 minutes = 1 day, 365 days = 1 year
		int userDays = userMinutes / 1440;
		int userYears = userDays / 365;
		
		// Calculate remaining days
		int remainingDays = userDays % 365;
		
		// Display result
		System.out.println(userMinutes + " minutes is " + userYears + " years, and " + remainingDays + " days.");
	}

}
