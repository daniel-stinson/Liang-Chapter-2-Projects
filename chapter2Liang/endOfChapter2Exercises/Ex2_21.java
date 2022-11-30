/**
 * This program calculates future investment value using the formula:
 * 
 * 
 *  futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate) ^ (numberOfYears * 12)
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Input 
		System.out.println("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate as a percentage: ");
		double interestRate = input.nextDouble();
		double monthlyInterestRate = interestRate / 1200;
		
		System.out.println("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		// Calculate
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate , numberOfYears * 12);
		
		// Output
		System.out.print("Your future investment value is: $" + futureInvestmentValue);

	}

}
