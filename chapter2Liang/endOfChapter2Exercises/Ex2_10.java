/* Calculate energy needed to heat water from initial temp to final temp using the formula:
 * Q = M * (finalTemperature – initialTemperature) * 4184
 * Q = energy in joules, M = weight of water in kilograms
 */
package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Have user enter weight of water, initial temp, and final temp
		System.out.println("Enter an amount for weight of water, a starting temperature and an ending temperature: ");
		double M = input.nextDouble();
		double initialTemperature = input.nextDouble();
		double finalTemperature = input.nextDouble();
		
		// Calculate
		double Q = M * (finalTemperature - initialTemperature) * 4184;
		
		// Display result
		System.out.println("The value of energy in joules is: " + Q);

	}

}
