package com.techelevator;

<<<<<<< HEAD
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {
		int n = 1;
		
		try (
				PrintWriter fizzBuzz = new PrintWriter("FizzBuzz.txt");
		 ) { 
			while(n <= 300) {
		
			String converted = String.valueOf(n);
			
			if (n <= 0) {
			}
		
			if (converted.contains("3") || (n % 3 == 0)) {
			converted = "Fizz";
			}
		
			if (converted.contains("5") || n % 5 == 0) {
			converted = "Buzz";
			}
		
			if (n % 15 == 0) {
			converted = "FizzBuzz";
			}
			n++;
			fizzBuzz.println(converted);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
=======
public class FizzWriter {

	public static void main(String[] args) {
		

>>>>>>> cf066afe3968b53edb46740624ccd61268edf103
	}

}
