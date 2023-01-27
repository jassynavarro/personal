package Intermediate_Programming;

import java.util.Scanner;
import java.util.*;

public class Tower_of_Hanoi {
	
	static void hanoiStepByStep(int n, char left, char right, char middle) {
		if (n == 0) // returns to previous recursion call
			return;
		else {
			/* shift all the disks before the largest disk from the leftmost rod 
				* to the middle rod to relocate the largest disk to the rightmost rod */
			hanoiStepByStep(n-1, left, middle, right); 
			System.out.println("Disk " + n + " moved from " + left + " to " + right);
			/* shift all relocated disks from the middle rod to the rightmost rod
				* to complete the problem */
			hanoiStepByStep(n-1, middle, right, left);
		}
	}
		
	public static void main(String[] args) {
			
			//Instantiate a scanner
		Scanner input = new Scanner(System.in);
		
			//variable for the input disk number
		int diskNum = 0;
		
			//variable for while loop
		boolean access = false; 
		
		System.out.print("Input number of disk/s (1-9): ");

			//while loop used to re-prompt user input in a try/catch as long as the condition is true.
		while (!access) {
			
			try {
				
				diskNum = input.nextInt();
				
			//if condition for the user's wrong input
				if (diskNum < 1 || diskNum > 9) {
					
					System.out.println();
					System.out.println("Wrong Input!");
					System.out.print("Try Again! Input number of disk/s (1-9): ");
					diskNum = input.nextInt();
				}
				
				else {
					
			//recursion function call
				System.out.println("");
				hanoiStepByStep(4, 'A', 'C', 'B');
				}
				
			}
			
			//Exception mistake for a wrong input of data type.
			catch(InputMismatchException mistake) {
				
				System.out.println("");
				System.out.println("Wrong Data Type"); 
				System.out.print("Try Again! Input number of disk/s (1-9): "); 
				input.next();
				
			}
			diskNum++;
		}
		input.close();
	}
	
} 

