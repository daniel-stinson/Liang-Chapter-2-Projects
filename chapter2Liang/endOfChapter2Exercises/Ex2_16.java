/* Calculates the area of a hexagon using the formula:
 * 
 * 			  3 Sqrt 3
 *     Area = -------- s^2
 * 			      2
 *  where s = side
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter the length of a side: ");
		double hexSide = input.nextDouble();
		
		// Calculation
		double hexagonArea = ((3 * Math.sqrt(3) / 2) * Math.pow(hexSide, 2) );
		
		// Output
		System.out.println("The area of the hexagon is : " + hexagonArea);

	}

}
