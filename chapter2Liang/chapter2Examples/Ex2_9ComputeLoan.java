package chapter2Examples;

import java.util.Scanner;

public class Ex2_9ComputeLoan {

	public static void main(String[] args) {
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Enter annual interest rate as percentage
		System.out.println("Enter annual interest rate as percentage: ");
		double annualInterestRate = input.nextDouble();
		
		// Obtain monthly rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Enter number of years
		System.out.println("Enter number of years: ");
		int numberOfYears = input.nextInt();
		
		// Enter loan amount
		System.out.println("Enter loan amount: ");
		double loanAmount = input.nextDouble();
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Display results
		System.out.println("The monthly payment is $" + 
				(int)(monthlyPayment * 100) / 100.0);
		System.out.println("The total payment is $" + 
				(int)(totalPayment * 100) / 100.0);
		
	}

}
