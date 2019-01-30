package com.techelevator;
import java.util.Scanner;


/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		int numToPrint;
		Scanner sc = new Scanner(System.in);
		System.out.print("number of fibonaci numbers to print: ");
		numToPrint = sc.nextInt();
		sc.close();

		int current = 1;
		int last = 0;
		System.out.println(last);
		System.out.println(current);

		int lastLast;
		for(int c =2; c< numToPrint; c++) {
			lastLast = last;
			last = current;
			current = lastLast + last;
			System.out.println(current);
		}
			}

		}
		
		
		
	


