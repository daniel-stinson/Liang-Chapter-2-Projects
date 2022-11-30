package chapter2Examples;

import java.util.Scanner;

public class Ex2_5SalesTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter purchase amount: ");
		
		double price = input.nextDouble();
		double tax = price * 0.06;
		
		System.out.println("Your tax is : " + (int)(tax * 100) / 100 + " dollars.");
	}

}
