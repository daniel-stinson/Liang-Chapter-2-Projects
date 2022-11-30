package chapter2Examples;

import java.util.Scanner;

public class Ex2_3_DisplayTime {

	public static void main(String[] args) {
		// Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Enter an integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		// Display result
		System.out.println(seconds + " seconds is " + minutes + " minutes, " + 
		remainingSeconds + " seconds.");
		
		

	}

}
