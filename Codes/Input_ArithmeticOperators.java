package Codes;

import java.util.Scanner;
public class Input_ArithmeticOperators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Instantiation
		
		System.out.println("Input first number: " );
		float num1 = scan.nextFloat();
		
		System.out.println("Input second number: " );
		float num2 = scan.nextFloat();
		
		System.out.println("Answer: " + num1*num2);
		
//organized version but slight longer
		//float num1;
		//float num2;
		//Scanner scan = new Scanner(System.in); //Instantiation
		
		//System.out.print("Input first number: " );
		//num1 = scan.nextFloat();
		
		//System.out.print("Input second number: " );
		//num2 = scan.nextFloat();
		
		//System.out.println("Answer: " + num1*num2);
		
		scan.close();
	}

}
