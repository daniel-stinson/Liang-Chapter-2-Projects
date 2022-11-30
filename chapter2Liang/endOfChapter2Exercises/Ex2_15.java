/* Distance of two points
 * 
 *  Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays the distance
 *  
 *  Formula is square root of (x2 - x1)^2 + (y2 - y1)^2
 * 
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input 
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Calculate
		double distance = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		
		// Display
		System.out.println("The distance between those points is: " + distance);

	}

}
