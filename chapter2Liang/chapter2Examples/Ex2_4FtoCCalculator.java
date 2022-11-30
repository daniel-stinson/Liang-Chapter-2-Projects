package chapter2Examples;

import java.util.Scanner;

public class Ex2_4FtoCCalculator {

	public static void main(String[] args) {
		// New scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt
		System.out.println("Enter a temperature in Fahrenheit: ");
		
		// Calculation
		double fahrenheit = input.nextDouble();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32.0);
		
		// Result
		System.out.println("A temperature of " + fahrenheit + " degrees Fahrenheit is " +
		celsius + " degrees Celsius.");
				
		

	}

}
