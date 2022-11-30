package endOfChapter2Exercises;

/*
 * Write a program that reads in the radius and length of a cylinder 
 * and computes the area and volume using the following formulas:
 * 
 * area = radius * radius * PI
 * volume = area * length
 */

import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter radius and length
		System.out.println("Enter a radius and a length:");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		// Calculate
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		// Display
		System.out.println("A cylinder with a length of " + length +
				" and a radius of " + radius + " has an area of  " +
				area + " and a volume of " + volume);

	}

}
