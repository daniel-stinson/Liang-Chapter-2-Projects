package chapter2Examples;

import java.util.Scanner;

public class Ex2_10ComputeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		System.out.print("Enter an amount: ");
		
		double userAmount = input.nextDouble();
		
		int remainingAmount = (int)(userAmount * 100);
		
		// Find remaining dollars
		int numberOfDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find remaining quarters
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find remaining dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// Find remaining nickels
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// Find remaining pennies
		int numberOfPennies = remainingAmount;
		
		// Display
		System.out.println("Your amount of " + userAmount + " consists of " +
		numberOfDollars + " dollars, " + numberOfQuarters + " quarters, " +
		numberOfDimes + " dimes, " + numberOfNickels + " nickels, and " + 
		numberOfPennies + " pennies.");
		
		
	}

}
