/**
 * This program calculates interest using the formula
 * 
 * 
 *  Interest = balance * (annualInterestRate / 1200)
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_20 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter balance and interest rate (E.g. 3 for 3% ): ");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		
		// Calculate
		double monthlyInterest = balance * (annualInterestRate / 1200);
		
		// Output
		System.out.println("Your interest is: " + monthlyInterest);

	}

}
