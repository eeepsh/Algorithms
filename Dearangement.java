/**
 * 
 */
package com.practice;

/**
 * @author deepasapkota 5313 Program Dearangement
 */

public class Dearangement {
	
	 
	public static int factorial(int number) {
		
		// base case
		if (number <= 1)
			return 1;
		else
			//recurssive function call
			return number * factorial(number - 1);
	}

	// recurssive mthods
	public static double dearangeamentMethod(int num) {
		//base case
		if (num== 0)
			return 1;
		else if (num == 1)
			return 0;
		else if (num == 2)
			return 1;
		else
			//recurssive function call
			return (num - 1) * (dearangeamentMethod(num - 1) + dearangeamentMethod(num - 2));
	}

	public static double probability(int num) {
		return (dearangeamentMethod(num) / factorial(num));
	}

	public static void main(String[] args) {
		System.out.println("Number" + "		   " + "Dearangement(number)               "
				+ "             " + "PROBABILITY ");

		int num = 1;
		do {
			System.out.println(num + "                   " + dearangeamentMethod(num) + "\t			             " + probability(num));
			num++;
		} while (num < 21);

	}
}