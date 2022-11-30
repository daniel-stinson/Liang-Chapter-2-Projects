/*
 * Calculate wind-chill temperature
 * 
 * Formula: t   = 35.74 + 0.6215t  - 35.75v^0.16 + 0.4275t v^0.16
 * 			 wc                  a                        a
 * 
 *  t  = outside temp in Fahrenheit  v = speed of wind   t   = wind-chill temp
 *   a													  wc
 *   
 *  Cannot be used if wind speed is less than 2 mph or outside temp is below -58 or above 41
 */
package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.println("Enter the temperature in Fahrenheit between -58 and 41 degrees: ");
		double outsideTemp = input.nextDouble();
		
		System.out.print("Enter the speed of the wind greater than 2 miles per hour: ");
		double windSpeed = input.nextDouble();
		
		// Calculate
		double windchill = 35.74 + (0.6215 * outsideTemp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * outsideTemp * Math.pow(windSpeed, 0.16));
		
		// Output
		System.out.println("\n");
		System.out.println("The wind-chill temperature is: " + windchill + " degrees.");
	}

}
