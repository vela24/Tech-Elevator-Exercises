package com.techelevator;

import java.util.Formatter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileSplitter {

	public static void main(String[] args) {
		String fileName = args[0];
		String count = args[1];
		String split = "/Users/tvela/Development/tadvela-java-green-exercises/m1-17-file-io-part2-exercises";
		fileName = split;
		count = "100";
		String[] array = fileName.split("//.");
		System.out.println(fileName);
		System.out.println(array.length);
		BufferedReader br = null;
		FileReader fr = null;
		FileWriter writer = null;
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;
			int linesRead = 0;
			int currentFile = 1;
			File f = new File(array[0] +"-"+currentFile+array[1]);
			boolean hasRun = false;
			while ((sCurrentLine = br.readLine()) !=null) {
				if(linesRead % Integer.parseInt(count) == 0 && hasRun == true) {
					writer.close();
					currentFile++;
					f = new File(array[0] + "-"+currentFile+array[1]);
					writer = new FileWriter(f);
				}
				if ((linesRead + 1) % Integer.parseInt(count)==0) {
					writer.write(sCurrentLine);
				}
				else {
					writer.write(sCurrentLine+"\n");
				}
				hasRun = true;
				linesRead++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(writer != null)
					writer.close();
				if(br != null)
					br.close();
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

					
				
		
//			public void readFile() {
//				while.x.hasNext()){
//					String a = x.next();
//					String b = x.next()
//				}
//			}
//		}
		
		
		//
//		System.out.println("Do I have args? ");
//        String fileName = args[0];
//        String count = args[1];
//        
//        System.out.println("fileName: " + fileName);
//        System.out.println("count: " + count);
//		
//	}
//

//Develop an application that takes a significantly large text file and splits it into smaller file chunks.
//
//The program should accept 2 parameters
//
//* The name of the text file to be split
//* The maximum number of lines that should appear in each output file
//
//Each output file that is created should have a sequential number assigned to it.
//
//For instance, a 250 line text file named "input.txt", split every 100 lines, will produce 3 output files
//
//* `input-1.txt` - 100 lines
//* `input-2.txt` - 100 lines
//* `input-3.txt` - 50 50 lines
//
//Use a sequential naming format for each file produced to guarantee uniqueness. Note, the sequence number is simply
//appended to the name of the input text file.
//
//These types of files use to be quite common back in the earlier days of computing when
//disks such as floppies were much smaller and couldn’t hold a larger program on their own.
//
//The application is launched like so:
//
//```
//java com.techelevator.FileSplitter input.txt 100
//```