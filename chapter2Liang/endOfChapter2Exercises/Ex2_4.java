/*
 * Convert pounds to kilograms
 */
package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_4 {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	// Input
	System.out.println("Enter a number in pounds: ");
	double pounds = input.nextDouble();
	
	// Calculation
	double kilograms = pounds * 0.454;
	
	// Result
	System.out.println(pounds + " pounds converts to " + kilograms + " kilograms.");

	}
}
