/*
 * Compute length using acceleration formula:
 * 
 * length = v ^2		a = acceleration, v = speed
 * 			____
 * 			 2a
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// User input
		System.out.print("Enter speed and acceleration: ");
		double v = input.nextDouble();
		double a = input.nextDouble();
		
		// Calculate
		double length = (Math.pow(v, 2)) / (2 * a);
		
		// Display
		System.out.println("The minimum length needed for takeoff is: " + length);

	}

}
