package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a whole number: ");
		
		int number = input.nextInt();
		input.nextLine();
		
		System.out.println( toFibonacci (number) );
		
	}

	
	public static int toFibonacci (int number ){
 
 	if (number == 0){
 		return 0;
 	} else if (number == 1 ) {
 		return 1;
 	} else { 
 		return toFibonacci(number - 1) + toFibonacci(number - 2);
 	}
	}
 		
}
