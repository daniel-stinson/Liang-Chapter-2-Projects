package chapter2Examples;

import java.util.Scanner;

public class Ex2_1_ComputeRadiusWithInput {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// User enters radius
		System.out.println("Enter a radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * Math.PI;
		
		// Display result
		System.out.println("The area of a circle with a radius of " + radius +
				" is " + area);
		
				

	}

}
