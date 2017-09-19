package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		System.out.println("Welcome to this simple word-searching program!" );
		File inputFile = getInputFileFromUser();
		String inputWord = getInputWord(); 
		boolean caseSensitive = isCaseSensitive();
		searchWord(inputWord, inputFile, caseSensitive);
	

	}
	

	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}
	
	private static String getInputWord() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter word to search in the text >>> ");
		String inputWord = userInput.nextLine();
		
		return inputWord;		
	}
	
	private static void searchWord(String inputWord, File inputFile, boolean caseSensitive) {
		int count = 0;
		
		try (Scanner input = new Scanner(inputFile)) {			
			while(input.hasNextLine()) {
				count++;
				
				//Reads in line and stores it in String variable line
				String line = input.nextLine();
									
				if (line.contains(inputWord) && caseSensitive) {
					System.out.println(count + ") " + line);
				} else if  (line.toUpperCase().contains(inputWord.toUpperCase()) && !caseSensitive ) {
					System.out.println(count + ") " + line);
				} else {
					//System.out.println(count + ") " + "Word not found");
				}
			}			
		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist.");
		}	
	}
	
	private static boolean isCaseSensitive() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Do you want your search to be case sensitive? (Y/N) >>> ");
		String yOrN = userInput.nextLine();
		
		boolean check = false;
		if (yOrN.toUpperCase().contains("Y")) {
			check = true;
		}
		if (yOrN.toUpperCase().contains("N")) {
			check = false;
		}
		return check;
		
	}
	
}
