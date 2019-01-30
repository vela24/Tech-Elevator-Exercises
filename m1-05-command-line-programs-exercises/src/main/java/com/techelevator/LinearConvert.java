package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 if you want to convert from feet to meters");
		System.out.println("Please enter 2 if you want to convert from meters to feet");
		int choice = scan.nextInt();
		
		double length = 0.00;
		double conversion = 0.00;
		
		if (choice==1) {
			System.out.println("Please enter length in feet...");
			length = scan.nextDouble();
			conversion = length * 0.3048;
			System.out.println("Length in meters is " + conversion + " meters.");
	}
		else if(choice==2) {
			System.out.println("Please enter length in meters...");
			length = scan.nextDouble();
			conversion = length * 0.3048;
			System.out.println("Length in feet is " + conversion + " feet.");
		}
		else {
			System.out.println("This is not going to workout if you dont type 1 or 2.");
		}
		

}
}
