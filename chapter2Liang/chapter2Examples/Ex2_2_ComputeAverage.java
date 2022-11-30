
package chapter2Examples;

import java.util.Scanner;

public class Ex2_2_ComputeAverage {

	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// User enters 3 numbers
		System.out.println("Enter three numbers: ");
		double num1 = input.nextDouble(); 
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		// Compute average
		double average = (num1 + num2 + num3) / 3;
		
		// Display average
		System.out.println("The average is " + average);

	}

}
