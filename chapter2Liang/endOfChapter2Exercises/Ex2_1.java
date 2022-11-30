/*
 * This is a Celsius to Fahrenheit converter
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_1 {

	public static void main(String[] args) {
		// New scanner
				Scanner input = new Scanner(System.in);
				
				// Prompt
				System.out.println("Enter a temperature in Celsius: ");
				
				// Calculation
				double celsius = input.nextDouble();
				
				double fahrenheit = ((1.8 * celsius) + 32.0);
				
				// Result
				System.out.println("A temperature of " + celsius + " degrees Celsius is " +
				fahrenheit + " degrees Fahrenheit.");

	}

}
