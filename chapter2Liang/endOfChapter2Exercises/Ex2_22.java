/**
 * This program rewrites example 2.10 to fix loss of accuracy when converting a double to an int
 * 
 * Input integer as whole number to represent dollars and cents (1156 = $11.56)
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
				System.out.print("Enter an amount as a whole number, i.e. 1156 for $11.56: ");
				
				int userAmount = input.nextInt();
				
				int remainingAmount = userAmount;
				
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
