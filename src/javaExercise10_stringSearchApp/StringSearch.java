package javaExercise10_stringSearchApp;

import java.util.Scanner;

public class StringSearch {

	public static void main(String[] args) {
		
		//declare variables
		String text; 
		boolean letterFound = false; 
		
		//gather string from user
		System.out.println("Please enter a string value:");
		Scanner scanner = new Scanner(System.in);
		text = scanner.nextLine(); 
		
		//Search text for the letter O
		for(int i = 0; i < text.length(); i++) {
			char currentLetter = text.charAt(i); 
			System.out.println("Character: " + currentLetter);
			if(currentLetter == 'O' ||currentLetter == 'o') {
				letterFound=true; 
				break; 
			}
		}

		if(letterFound) {
			System.out.println("This string contains the letter O!");	
		}
		else {
			System.out.println("This string does not contain the letter O!");
		
		}
	}

}
