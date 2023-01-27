package Codes;

import java.util.Scanner;
public class Conditional_Statements {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //instantiation
		//subject variables
		double introComp; 
		double fundaProg;
		double eng;
		double fil;
		double average;
		
		System.out.print("Enter your grade in Introduction to Programming: ");
		introComp = scan.nextDouble(); //call user input
		
		System.out.print("Enter your grade in Fundamentals of Programming: ");
		fundaProg = scan.nextDouble();
		
		System.out.print("Enter your grade in English: ");
		eng = scan.nextDouble();
		
		System.out.print("Enter your grade in Filipino: ");
		fil = scan.nextDouble();
		
		average = (introComp + fundaProg + eng + fil) / 4; //call of average formula
		
		System.out.println();
		System.out.println("Introduction to Programming: " + introComp); //output of subjects and grades
		System.out.println("Fundamentals of Programming: " + fundaProg);
		System.out.println("English: " 					   + eng);
		System.out.println("Filipino: " 				   + fil);
		System.out.println();
		System.out.println("Average: " + average);
		
		//conditional statements for honors
		if(average > 100) { 
			System.out.println("Invalid Grade");
		}
		else if(average >= 98) {
			System.out.println("With Highest Honors");
		}
		if(average >= 95) {
			if(average <= 97.99)System.out.println("With High Honors");
		}
		if(average >= 90) {
			if(average <= 94.99)System.out.println("With Honors");
		}
		if(average >= 75) {
			if(average <= 89.99)System.out.println("Passed");
		}
		else{System.out.println("Failed");
		
		}
	
		 scan.close();
		
	}

}
