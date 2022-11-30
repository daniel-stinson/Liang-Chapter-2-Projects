/*
 * Financial app - compound value
 * If you save $100 / month with annual interest rate of 5%. 
 * Monthly interest rate is 0.05 / 12 (0.00417)
 * After first month, value is: 100 * (1 + 0.00417) = 100.417  (value becomes the next months interest that is added)
 * After second month, value is: (100 + 100.417) * (1 + 0.00417) = 201.252
 * After third month, value is: (100 + 201.252) * (1 + 0.00417) = 302.507
 * 
 * Have user enter a monthly savings amount, and calculate amount after certain number of months (6 in this example)
 * (Will be revised to be a loop in next chapter)
 * 
 * 
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_13 {

	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount to save: ");
		double savingsAmount = input.nextDouble();
		
		// Calculate
		// 1 month
		double total = savingsAmount * (1 + 0.00417);
		// 2 months
		total = (savingsAmount + total) * (1 + 0.00417);
		// 3 months
		total = (savingsAmount + total) * (1 + 0.00417);
		// 4 months
		total = (savingsAmount + total) * (1 + 0.00417);
		// 5 months
		total = (savingsAmount + total) * (1 + 0.00417);
		// 6 months
		total = (savingsAmount + total) * (1 + 0.00417);
		
		
		// Display
		System.out.printf("Your amount saved after 6 months is: $%.2f.%n", total);

	}

}
