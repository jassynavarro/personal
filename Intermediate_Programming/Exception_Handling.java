package Intermediate_Programming;
import java.util.Scanner;
public class Exception_Handling {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int value;
		double squareRoot;
	
		try 
		{
			System.out.print("Enter a value: ");
			value = scan.nextInt();
			squareRoot = Math.sqrt(value);
		
			System.out.println("Input: " 	   +      value);
			System.out.println("Square root: " + squareRoot);	
		}
		catch (ArithmeticException mistake) 
		{
			System.out.println("Exception occured");
		}
		System.out.println("End of program");
	}

}
