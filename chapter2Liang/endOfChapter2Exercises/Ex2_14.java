/* Calculates BMI
 * BMI = weight in kg / sq of height in meters
 * 1 pound is 0.45359237 kilograms and 1 inch is 0.0254 meters
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input
		System.out.println("Enter your weight in pounds and your height in inches: ");
		double userWeight = input.nextDouble();
		double userHeight = input.nextDouble();
		
		// Calculation
		double weight = userWeight * 0.45359237;
		double height = userHeight * 0.0254;
		double bmi = weight / (height * height) ;
		
		// Output
		System.out.println("Your BMI is " + bmi);

	}

}
