/*
 * Modify exercise 1.11 so that a user can calculate estimated population in a given year
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_11 {

	public static void main(String[] args) {
		// Enter user information
		
		long currentPop = 312032486;
		long changePop = 2780424;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of years: ");
		int userNum = input.nextInt();
		
		// Calculate and display
		
		System.out.println("In " + userNum +  " year(s), the population will be: " + (currentPop + (changePop * userNum)) + " people." );
		//System.out.println("In two years, the population will be: " + (currentPop + (changePop * 2))  + " people." );
		//System.out.println("In three years, the population will be: " + (currentPop + (changePop * 3))  + " people." );
		//System.out.println("In four years, the population will be: " + (currentPop + (changePop * 4))  + " people." );
		//System.out.println("In five years, the population will be: " + (currentPop + (changePop * 5))  + " people." );

	}

}
