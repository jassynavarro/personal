package Intermediate_Programming;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {

//		// import scanner for the user's input
//		    Scanner scan = new Scanner (System.in);
//		
//		// variables for the first and second number and variable for the maximum number of outcome
//		    int M;
//		    int N;
//		    int sum = 0;
//		    int maxNumberofOutcome = 15;
//		
//		// out print to display and code to get the user's input
//		    System.out.println("Input a 2 series number: ");
//		
//		    System.out.print("M: ");
//		    M = scan.nextInt();
//		
//		    System.out.print("N: ");
//		    N = scan.nextInt();
//		
//		    sum = M + N - 1;
//		    System.out.println("Fibonacci series of " + maxNumberofOutcome + " numbers: ");
//		//    System.out.print(M + " " + N + " ");
//		// loop 
//		    for (int i=sum; i < maxNumberofOutcome; i++) {
//		        System.out.print(fibonacciRecursion(i) + " ");
//		    }
//		
//		}
//		
//		 
//		
//		// method for the fibonacci recursion
//		public static int fibonacciRecursion(int n) {
//		
//		    if (n == 0) {
//		
//		    return n;
//		    }
//		
//		    if (n == 1 || n == 2) {
//		
//		    return n;
//		    }
//		
//		    return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		
		///////////////////////////////////////////////////////////////////////////
		
		Scanner scan = new Scanner (System.in);
		
	    int M;
	    int N;
	    int numOutcome = 16;
	    
	    System.out.print("Input M integer: ");
	    M = scan.nextInt();
	
	    System.out.print("Input N integer: ");
	    N = scan.nextInt();

	    
	    for (int i = 0; i < numOutcome; i++) {
	        System.out.print(fibonacciRecursion(M, N) + " ");
	    }
	
	}
	
	public static int fibonacciRecursion(int M, int N) {	
		
	    if (M == 0 || N == 1) {
	
	    return 1;
	    }
	    int add = M + N;
	    return fibonacciRecursion(add + N);
		
	}

}