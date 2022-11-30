/* Write a program that reads the subtotal and the gratuity rate,
 * then computes the gratuity and total
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Enter subtotal and gratuity rate
		System.out.println("Enter your subtotal and the gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		// Calculate
		double gratuityAmount = gratuityRate * .10;
		double total = subtotal + gratuityAmount;
		
		// Display result
		System.out.println("Your subtotal is $" + subtotal + " and your gratuity is $" + gratuityAmount + ".");
		System.out.print("\n");
		System.out.print("Your total after gratuity has been added is $" + total);

	}

}
