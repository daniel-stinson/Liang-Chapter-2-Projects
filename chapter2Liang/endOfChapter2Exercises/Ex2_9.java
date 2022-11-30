/* Average acceleration is defined as the change of velocity divided by the time taken to make the change.
 * 
 * Formula:			 vsub1 - vsub0
 * 				a = ________________
 * 					
 * 					       t
 * 
 * vsub0 = starting velocity  vsub1 = ending velocity  a = acceleration  t = time
 * 
 */
package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input v0, v1, and t
		System.out.println("Enter starting velocity, ending velocity, and time: ");
		float v0 = input.nextFloat();
		float v1 = input.nextFloat();
		float t = input.nextFloat();
		System.out.println(v0 + ", " + v1 + ", " + t);
		// Calculate
		float acceleration = ((v1 - v0) / t);
		
		// Display
		System.out.println("The average accelration is: " + acceleration);
	}

}
