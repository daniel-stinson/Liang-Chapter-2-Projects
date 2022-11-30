/*
 * Convert feet to meters
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input
		System.out.println("Enter a number in feet: ");
		double feet = input.nextDouble();
		
		// Calculation
		double meters = feet * .305;
		
		// Result
		System.out.println(feet + " feet converts to " + meters + " meters.");

	}

}
