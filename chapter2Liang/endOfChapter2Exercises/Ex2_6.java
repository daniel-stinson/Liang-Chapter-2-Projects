/* Write a program that reads an integer between 0 and 999 and adds all the digits in the integer.
 *  For example, if an integer is 932, the sum of all its digits is 14.
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Enter number
		System.out.println("Enter a number between 0 and 999: ");
		int userNumber = input.nextInt();
		int remainingAmount = (int)userNumber;
		
		// Get first digit
		int firstDigit = (int)userNumber % 10;
		remainingAmount = remainingAmount / 10;
		
		// Get second digit
		int secondDigit = (int)remainingAmount % 10;
		remainingAmount = remainingAmount / 10;
		
		// Get third digit
		int thirdDigit = (int)remainingAmount % 10;
		remainingAmount = remainingAmount / 10;
		
		// Add digits together
		int total = firstDigit + secondDigit + thirdDigit;
		
		// Display
		System.out.println("You input the number: " + userNumber);
		System.out.println(thirdDigit + " + " + secondDigit + " + " + firstDigit);
		System.out.println("The digits added together is " + total);

	}

}
