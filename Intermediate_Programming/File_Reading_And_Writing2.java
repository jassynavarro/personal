package Intermediate_Programming;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Reading_And_Writing2 {
	public static void main(String[] args) {

		// 2.
		try {
			
			Scanner scan = new Scanner (System.in); //instantiation
			FileReader reader = new FileReader("C:\string names.txt"); //instantiation
			BufferedReader BuffRead = new BufferedReader (reader);
			
			int SequenceNum; //variable for the sequence Numbers
			int input; //variable for the user's input
			
			System.out.print("Enter a number: ");
			input = scan.nextInt(); //scan the user's input
			
			while((SequenceNum = reader.read()) != -1) { //while loop is used
				
				if(input == SequenceNum) { //if conditional statement is for the user's input that is found included in the text file
					System.out.println("Found");
					break;
				}
			}
			
			if(input != SequenceNum) { //if conditional statement for the user's wrong input or not found
				System.out.println("Not Found");
			}
			
			reader.close();
			scan.close();
			
		}
			catch (IOException e) { //catches the error output
			e.printStackTrace();
			}
		
		
		
		
	}

}
