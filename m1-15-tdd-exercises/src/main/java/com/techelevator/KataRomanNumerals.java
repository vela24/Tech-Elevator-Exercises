package com.techelevator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class KataRomanNumerals {

	private String[] oneRoman = new String[] {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	private String[] tenRoman = new String[] {"","X","XX","XXX","XL","L","LI","LII","LIII","LX"};
	private String [] hundredRoman = new String[] {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	private String [] thousandRoman = new String[] {"","M","MM","MMM"};
	
public String convertToRoman(int n) {
	//File text = new File("");
//	Scanner myScanner = new Scanner(System.in);
//	System.out.println("Please enter a number from 1 - 3000...");
//	String searchNum = myScanner.nextLine();
//	int romanNum = Integer.parseInt(searchNum);
	
	int romanNum = n;
	String romanNumeral = "";
	romanNumeral += thousandRoman[romanNum/1000];
	romanNumeral += hundredRoman[(romanNum%1000)/100];
	romanNumeral += tenRoman[(romanNum%100)/10];
	romanNumeral += oneRoman[romanNum%10];
	
	System.out.println("Your roman numeral is: " + romanNumeral);
	return romanNumeral;
	
}


}
//There is no need to be able to convert numbers larger than about 3000. (The Romans themselves didn't tend to go any higher)
