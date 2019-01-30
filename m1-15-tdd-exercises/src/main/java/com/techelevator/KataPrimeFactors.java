package com.techelevator;
import java.util.Scanner;

public class KataPrimeFactors {



	   public static void main(String args[]){
	      
		   
		   int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	      
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }
	
}


//Factorize a positive integer number into its prime factors.
//
//Use the TDD approach to write tests that call a single method `factorize()`. Given a positive integer input n, return its prime factors.
//
//1 is always omitted from the result set.
//
//*Sample Output*
//```
//2 -> returns [2]
//3 -> returns [3]
//4 -> returns [2, 2]
//6 -> returns [2, 3]
//7 -> returns [7]
//8 -> returns [2, 2, 2]
//9 -> returns [3, 3]
//10 -> returns [2, 5]
//```
//
//Link to [Wikipedia Prime Factors](https://en.wikipedia.org/wiki/Prime_factor)