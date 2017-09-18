package com.techelevator;

public class KataFizzBuzz {
	
	public String fizzBuzz(int n) {
	String converted = String.valueOf(n);
		
		if (n <= 0) {
		return "";
		}
	
		if (n>100) {
		return "";
		}
	
		if (converted.contains("3") || (n % 3 == 0)) {
		converted = "Fizz";
		}
	
		if (converted.contains("5") || n % 5 == 0) {
		converted = "Buzz";
		}
	
		if (n % 15 == 0) {
		converted = "FizzBuzz";
		} return converted;	
	}
}
