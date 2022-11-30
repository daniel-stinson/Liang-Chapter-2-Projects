/**
 * This program computes the cost of driving using the formula:
 * 
 *  Cost = (distance / milesPerGallon) * priceOfGas
 * 
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter price per gallon: ");
		double priceOfGas = input.nextDouble();
		
		// Calculate
		double drivingCost = (distance / milesPerGallon) * priceOfGas;
		
		// Output
		System.out.println("The cost of driving is: $" + drivingCost);

	}

}
