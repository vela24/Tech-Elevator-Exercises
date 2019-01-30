package com.techelevator;

import java.util.Formatter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FizzWriter {

	public static void main(String[] args) {
		String input = "300";
		Integer amount = 0;
		FileWriter writer = null;
		File f;
		
		try {
			f = new File("FizzBuzz.txt");
			writer = new FileWriter(f);
			String fileResponse = "";
			if(input != null) {
				amount = Integer.parseInt(input);
			}
			for(int i = 1; i< amount+1; i++) {
				fileResponse = fizzBuzz(i);
				writer.write(fileResponse + (i % (amount)==0 ? "" : "/n"));
			}
		} catch(IOException e) {
			
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
			}catch (IOException e) {
				
			}
		}
	}
	public static String fizzBuzz (int amount) {
		if(amount % 5 == 0 && amount % 3 == 0) {
			return "FizzBuzz";
		} else if(amount % 5 == 0) {
			return "Buzz";
		} else if(amount % 3 == 0) {
			return "Fizz";
		} else {
			return amount + "";
		}
		
	}
}
//		String myFileLocation = "/Users/tvela/Development/tadvela-java-green-exercises";
//		File text = new File(myFileLocation);
//		
//		
//		if(text.exists()) {
//			System.out.println("file: "+ text.getName());
//			System.out.println("absolute path " + text.getAbsolutePath());
//			if(text.isDirectory()) {
//				System.out.print("type: directory");
//				System.out.println();
//			}
//			else if(text.isFile()) {
//				System.out.println("type: file");
//			}
//			System.out.println("size file: " + text.length());
//		} else {
//			System.out.println(text.getAbsolutePath() +"does not exist");
//		}
//		
//		try {
//			Scanner scanner = new Scanner(text);
//			
//			int count = 0;
//			
//			while(scanner.hasNextLine()) {
//				String s = scanner.nextLine();
//				System.out.println(s);
//				
//				String [] toSplit = s.split(",");
//				
//				String FizzBuzz = toSplit[0];
//				String Fizz = toSplit[1];
//				String Buzz = toSplit[2];
//			}
//		}
//	}
//}
		
		
		
//		try {
//			Scanner scanner = new Scanner(text);
//			
//			while (scanner.hasNextLine()) {
//				String s = scanner.nextLine();
//				System.out.println(s);
//				
//				//now split into fields
//				String[] myFields = s.split(",");
//				
//				String name = myFields[0];
//				String id = myFields[1];
//				String whatever = myFields[2];
//				
//				System.out.println("values: " + "Name: " + name + ", id: " + id + " whatever: " + whatever);
//				System.out.println ("************");
//			}
//         
//	}
//
//}

//# File I/O Part 2 Exercises
//
//## FizzWriter
//
//Create a program to write out the result of FizzBuzz (1 to 300) to a file called `FizzBuzz.txt`.
//
//* If the number is divisible by 3 or contains a 3, print “Fizz”
//* If the number is divisible by 5 or contains a 5, print “Buzz”
//* If the number is divisible by 3 and 5, print “FizzBuzz”
//* Otherwise print the number.
//
//The application is launched like so:

