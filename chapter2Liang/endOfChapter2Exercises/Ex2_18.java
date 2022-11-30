/* Print a table that displays:   a   b   pow(a,b)
 * 								  1   2   1
 * 								  2   3   8
 * 								  3   4   81
 * 								  4   5   1024
 * 								  5   6   15625
 */

package endOfChapter2Exercises;

import java.util.Scanner;

public class Ex2_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input
	
		int userNum1 = 1;
		int userNum2 = 2;
		int userNum3 = 3;
		int userNum4 = 4;
		int userNum5 = 5;
		
		// Calculate
		int userPow1 = (int) Math.pow(userNum1, 2);
		int userPow2 = (int) Math.pow(userNum2, 3);
		int userPow3 = (int) Math.pow(userNum3, 4);
		int userPow4 = (int) Math.pow(userNum4, 5);
		int userPow5 = (int) Math.pow(userNum5, 6);
		
		// Output
		System.out.println("a" + "\t" + "b" + "\t" + "pow(a,b)");
		System.out.println(userNum1 + "\t" + "2" + "\t" + userPow1);
		System.out.println(userNum2 + "\t" + "3" + "\t" + userPow2);
		System.out.println(userNum3 + "\t" + "4" + "\t" + userPow3);
		System.out.println(userNum4 + "\t" + "5" + "\t" + userPow4);
		System.out.println(userNum5 + "\t" + "6" + "\t" + userPow5);

	}

}
