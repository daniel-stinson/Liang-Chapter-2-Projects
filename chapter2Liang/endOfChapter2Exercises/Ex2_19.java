/* Prompt user to enter 3 points (x1, y1), (x2, y2), (x3, y3) to calculate area of a triangle
 * 
 * Formulas:  s = (side 1 + side 2 + side 3) / 2
 * 			  
 * 			  area = SqRt (s(s - side 1)s(s - side 2)s(s - side 3))
 */


package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input
		System.out.println("Enter three sets of points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Calculate
		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		// Output	
		System.out.print("The area of the triangle is: " + area);

	}

}
